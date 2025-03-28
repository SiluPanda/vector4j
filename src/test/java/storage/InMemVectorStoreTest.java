package storage;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.silupanda.storage.InMemVectorStore;
import org.silupanda.storage.Vector;
import org.silupanda.storage.VectorMetadata;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class InMemVectorStoreTest {

    private InMemVectorStore<String> vectorStore;

    @BeforeEach
    void setUp() {
        vectorStore = new InMemVectorStore<>(128); // Assuming dimension 128 for testing
    }

    @Test
    void testSaveAndGet() {
        Vector<String> vector = new Vector<>(1L, List.of(0.1f, 0.2f), new VectorMetadata<>("Metadata1"));
        vectorStore.save(vector);

        Vector<String> retrieved = vectorStore.get(1L);
        Assert.assertNotNull(retrieved);
        Assert.assertEquals(vector.getId(), retrieved.getId());
        Assert.assertEquals(vector.getEmbeddings(), retrieved.getEmbeddings());
        Assert.assertEquals(vector.getMetadata().getContent(), retrieved.getMetadata().getContent());
    }

    @Test
    void testSearch() {
        Vector<String> vector1 = new Vector<>(1L, List.of(0.1f, 0.2f), new VectorMetadata<>("Metadata1"));
        Vector<String> vector2 = new Vector<>(2L, List.of(0.3f, 0.4f), new VectorMetadata<>("Metadata2"));

        vectorStore.save(vector1);
        vectorStore.save(vector2);

        List<Vector<String>> results = vectorStore.search(List.of(0.1f, 0.2f), 1, metadata -> true);
        Assert.assertNotNull(results);
        assertEquals(1, results.size());
        assertEquals(vector1.getId(), results.get(0).getId());
    }

    @Test
    void testUpdateAndDelete() {
        Vector<String> vector = new Vector<>(1L, List.of(0.1f, 0.2f), new VectorMetadata<>("Metadata1"));
        vectorStore.save(vector);

        vector.setEmbeddings(List.of(0.5f, 0.6f));
        vectorStore.update(1L, vector);

        Vector<String> updatedVector = vectorStore.get(1L);
        Assert.assertEquals(List.of(0.5f, 0.6f), updatedVector.getEmbeddings());

        vectorStore.delete(1L);
        Assert.assertNull(vectorStore.get(1L));
    }

    @Test
    void testGetAll() {
        Vector<String> vector1 = new Vector<>(1L, List.of(0.1f, 0.2f), new VectorMetadata<>("Metadata1"));
        Vector<String> vector2 = new Vector<>(2L, List.of(0.3f, 0.4f), new VectorMetadata<>("Metadata2"));

        vectorStore.save(vector1);
        vectorStore.save(vector2);

        List<Vector<String>> allVectors = vectorStore.getAll();
        assertEquals(2, allVectors.size());
    }
}
