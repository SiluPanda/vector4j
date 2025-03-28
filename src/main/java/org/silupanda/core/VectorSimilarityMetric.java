package org.silupanda.core;

public enum VectorSimilarityMetric {
    /**
     * Represents the cosine similarity metric for vector comparison.
     * Cosine similarity measures the cosine of the angle between two non-zero vectors
     * in an n-dimensional space, often used to evaluate the similarity or dissimilarity
     * between two vectors based on their orientation regardless of magnitude.
     */
    COSINE,

    /**
     * Represents the Jaccard similarity metric for vector comparison.
     * Jaccard similarity measures the similarity between two sets by dividing the size
     * of their intersection by the size of their union. Commonly used in scenarios
     * where inputs are sets and the goal is to evaluate the overlap or similarity between them.
     */
    JACCARD,

    /**
     * Represents the Hamming similarity metric for vector comparison.
     * Hamming similarity is based on the concept of comparing two equal-length binary strings
     * and counting the number of positions at which the corresponding symbols are different.
     * It is commonly used to measure the similarity or distance between sequences such as binary code or DNA.
     */
    HAMMING,

    /**
     * Represents the Euclidean distance metric for vector comparison.
     * Euclidean distance measures the straight-line distance between two points in Euclidean space.
     * It is widely used as a similarity or dissimilarity measure, especially in contexts where
     * spatial distance is significant or relevant.
     */
    EUCLIDEAN,
}
