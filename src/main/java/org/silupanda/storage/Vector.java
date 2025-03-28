package org.silupanda.storage;

import java.util.List;

/**
 * Represents a vector that is used to store embeddings and associated metadata.
 * This class is parameterized with a type variable {@code T}, allowing metadata
 * to be of any specified type.
 *
 * @param <T> the type of metadata associated with the vector
 */
public class Vector<T> {

    /**
     * The unique identifier of the vector.
     */
    private Long id;

    /**
     * A list of floating-point numbers representing the vector's embeddings.
     */
    private List<Float> embeddings;

    /**
     * Metadata associated with the vector, which can be of any specified type {@code T}.
     */
    private VectorMetadata<T> metadata;

    /**
     * Constructs a new empty vector.
     */
    public Vector() {
    }

    /**
     * Constructs a new vector with the specified ID, embeddings, and metadata.
     *
     * @param id         the unique identifier of the vector
     * @param embeddings the vector embeddings as a list of floats
     * @param metadata   the metadata associated with the vector
     */
    public Vector(Long id, List<Float> embeddings, VectorMetadata<T> metadata) {
        this.id = id;
        this.embeddings = embeddings;
        this.metadata = metadata;
    }

    /**
     * Returns the unique identifier of the vector.
     *
     * @return the vector's ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the vector.
     *
     * @param id the vector's new ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns the embeddings of the vector.
     *
     * @return a list of floats representing the vector's embeddings
     */
    public List<Float> getEmbeddings() {
        return embeddings;
    }

    /**
     * Sets the embeddings of the vector.
     *
     * @param embeddings the new embeddings as a list of floats
     */
    public void setEmbeddings(List<Float> embeddings) {
        this.embeddings = embeddings;
    }

    /**
     * Returns the metadata associated with the vector.
     *
     * @return the metadata of type {@code T}
     */
    public VectorMetadata<T> getMetadata() {
        return metadata;
    }

    /**
     * Sets the metadata associated with the vector.
     *
     * @param metadata the new metadata of type {@code T}
     */
    public void setMetadata(VectorMetadata<T> metadata) {
        this.metadata = metadata;
    }
}
