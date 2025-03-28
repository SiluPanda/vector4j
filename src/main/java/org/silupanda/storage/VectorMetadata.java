package org.silupanda.storage;

/**
 * Represents metadata associated with a vector.
 * This generic class holds metadata content provided as a generic type.
 *
 * @param <T> the type of the metadata content
 */
public class VectorMetadata<T> {
    private T content;

    /**
     * Default constructor.
     * Initializes an instance of VectorMetadata without setting the content.
     */
    public VectorMetadata() {
    }

    /**
     * Parameterized constructor.
     * Initializes an instance of VectorMetadata with the specified content.
     *
     * @param content the content of the metadata
     */
    public VectorMetadata(T content) {
        this.content = content;
    }

    /**
     * Retrieves the content of the metadata.
     *
     * @return the metadata content
     */
    public T getContent() {
        return content;
    }

    /**
     * Sets the content of the metadata.
     *
     * @param content the metadata content to set
     */
    public void setContent(T content) {
        this.content = content;
    }
}
