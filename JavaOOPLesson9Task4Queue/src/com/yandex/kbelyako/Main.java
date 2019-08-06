//4) Шелдон, Леонард, Воловиц, Кутрапалли и Пенни стоят в очереди за ≪двойной колой≫. Как только человек выпьет такой колы, 
//он раздваивается и оба становятся в конец очереди, чтобы выпить еще стаканчик. Напишите программу, которая выведет на экран
//состояние очереди в зависимости от того, сколько стаканов колы выдал аппарат с чудесным напитком. Например, если было выдано
//только два стакана, то очередь выглядит как: [Volovitc, Kutrapalli, Penny, Sheldon, Sheldon, Leonard, Leonard].

package com.yandex.kbelyako;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		ArrayDeque<String> testQueue = new ArrayDeque<String>();

		testQueue.add("Sheldon");
		testQueue.add("Leonard");
		testQueue.add("Volovitc");
		testQueue.add("Kutrapalli");
		testQueue.add("Penny");

		magicCola(testQueue, 2);

	}

	public static void magicCola(ArrayDeque<String> inputArrayDeque, int number) {
		ArrayDeque<String> arrayAfter = inputArrayDeque.clone();
		for (int i = 0; i < number; i++) {
			arrayAfter.addLast(arrayAfter.peekFirst());
			arrayAfter.addLast(arrayAfter.pollFirst());
		}

		System.out.println(arrayAfter);

	}
}
