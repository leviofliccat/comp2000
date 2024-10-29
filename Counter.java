import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * This file is part of a project entitled ModernConcurrency which is provided
 * as sample code for the following Macquarie University unit of study:
 * 
 * COMP2000 "Object Oriented Programming Practices"
 * 
 * Copyright (c) 2019-2021 Dominic Verity and Macquarie University.
 * 
 * ModernConcurrency is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * ModernConcurrency is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with ModernConcurrency. (See files COPYING and COPYING.LESSER.) If
 * not, see <http://www.gnu.org/licenses/>.
 */


public class Counter {
	private int value;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

	// No attempt made here to ensure thread safety.
	// We could add the 'synchronized' keyword to 'increment'
	// and 'decrement', but see the 'atomic_counter' example for
	// a different approach using atomics.

	public void increment() {
        writeLock.lock();
        try {
            value++;
            System.out.println(Thread.currentThread().getName() + " is added for increment");
        }
        finally {
            writeLock.unlock();
        }
		
	}

	public void decrement() {
		writeLock.lock();
        try {
            value--;
            System.out.println(Thread.currentThread().getName() + " is added for decrement");
        }
        finally {
            writeLock.unlock();
        }
	}

	public int get() {
		// readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is added for reading");
            return value;
        }
        finally {
            // readLock.unlock();
        }
	}
}