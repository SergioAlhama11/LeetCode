package com.sergio.Udemy.StackQueues._01_queue_with_stacks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class QueueWithStacksTest {

  @Test
  void queueWithStacksTest() {
    QueueWithStacks queue = new QueueWithStacks();

    assertEquals(0, queue.size());
    queue.add(1);
    queue.add(2);
    queue.add(3);
    assertEquals(1, queue.remove());
    assertEquals(2, queue.peek());
    assertEquals(2, queue.size());
    queue.add(4);
    assertFalse(queue.isEmpty());
    assertEquals(2, queue.remove());
    assertEquals(3, queue.remove());
    assertEquals(4, queue.remove());
    assertTrue(queue.isEmpty());
  }
}
