package ru.itis.lab11;

public class TreeMaker {

    /**
     * Член класса, отражающий его внутреннюю структуру.
     * Поскольку мы можем передумать и изменить внутреннюю структуру, оставляя прежнюю функциональность класса,
     * то поставим модификатор видимости private
     */
    private Node root;

    public Node createTree(int[] data) {

        root = new Node(data[0]);

        // текущий уровень в дереве
        int level = 0;

        // индекс текущего элемента в массиве входных данных
        int dataCounter = 0;

        // размер массива входных данных
        int dataLength = data.length;

        // массив элементов дерева на текущем уровне
        Node[] currentLevel = {root};

        while (dataCounter < dataLength) {

            // готовим следующий уровень
            Node[] nextLevel = new Node[1 << (level + 1)];

            // Проходимся по текущему уровню, чтобы сформировать левого и правого потомка для каждого элемента
            for(int i = 0; i < (1 << level); ++i) {

                // Формируем новый элемент, если есть еще данные для обработки
                if(++dataCounter < dataLength) {
                    nextLevel[2 * i] = new Node(data[dataCounter]);
                    currentLevel[i].left = nextLevel[2 * i];
                } else {
                    // если все данные закончились, то работу считаем завершенной и выходим из метода, возвращая ссылку на корень дерева
                    return root;
                }

                // Формируем новый элемент, если есть еще данные для обработки
                if(++dataCounter < dataLength) {
                    nextLevel[2 * i + 1] = new Node(data[dataCounter]);
                    currentLevel[i].right = nextLevel[2 * i + 1];
                } else {
                    return root;
                }
            }

            // Переходим на следующий уровень
            currentLevel = nextLevel;
            level++;
        }

        return root;
    }

    /**
     * Вывести на консоль содержимое дерева (как набор данных)
     */
    public void printTree() {
        printNode(root);
    }

    /**
     * Метод для внутреннего пользования внутри класса TreeMaker, поэтому сделаем его private
     * метод работает рекурентно
     */
    private void printNode(Node node) {
        if (node != null) {

            System.out.println(node.value);

            // Рекурентный вызов printNode для левого и правого потомков
            printNode(node.left);
            printNode(node.right);
        }
    }

}

