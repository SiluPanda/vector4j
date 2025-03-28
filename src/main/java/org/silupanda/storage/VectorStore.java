package org.silupanda.storage;

import java.util.List;
import java.util.function.Predicate;

public interface VectorStore<T> {
    void save(Vector<T> vector);
    Vector<T> get(Long id);
    List<Vector<T>> search(List<Float> queryEmbedding, Integer topK, Predicate<VectorMetadata<T>> filter);
    void update(Long id, Vector<T> vector);
    void delete(Long id);
    List<Vector<T>> getAll();
}
