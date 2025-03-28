package org.silupanda.storage;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class InMemVectorStore<T> implements VectorStore<T> {
    private Map<Long, Vector<T>> vectorMap;
    public InMemVectorStore(Integer dimension) {
        this.vectorMap = Map.of();
    }


    @Override
    public void save(Vector<T> vector) {

    }

    @Override
    public Vector<T> get(Long id) {
        return null;
    }

    @Override
    public List<Vector<T>> search(List<Float> queryEmbedding, Integer topK, Predicate<VectorMetadata<T>> filter) {
        return List.of();
    }

    @Override
    public void update(Long id, Vector<T> vector) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Vector<T>> getAll() {
        return List.of();
    }
}
