package com.ankit.circularbuffer;

public class CircularBuffer<T> {
    T[] buffer;
    int readCursor;
    int writeCursor;

    public CircularBuffer(int size) {
        buffer = (T[]) new Object[size];
    }

    public boolean offer(T value) {
        if(buffer[writeCursor] != null) {
            return false;
        }
        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }

    public T poll() {
        T value = buffer[readCursor];
        if(value != null) {
            buffer[readCursor] = null;
            readCursor = next(readCursor);
        }
        return value;
    }


    private int next(int cursor) {
        return (cursor + 1) % buffer.length;
    }

}
