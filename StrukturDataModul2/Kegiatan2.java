package TugasPraktikum.StrukturDataModul2;

public class Kegiatan2 {
    private Node angkaTerbesar;

    public Kegiatan2() {
        angkaTerbesar = null;
    }

    public static void main(String[] args) {
        Kegiatan2 list = new Kegiatan2();
        list.add(8);
        list.add(7);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(3);
        list.sortList();
        list.printList();
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (angkaTerbesar == null) {
            angkaTerbesar = newNode;
            return;
        }

        if (angkaTerbesar.dataAngka > data) {
            newNode.angkaLain = angkaTerbesar;
            angkaTerbesar = newNode;
            return;
        }

        Node nilaiBaru = angkaTerbesar;

        while (nilaiBaru.angkaLain != null && nilaiBaru.angkaLain.dataAngka < data) {
            nilaiBaru = nilaiBaru.angkaLain;
        }

        newNode.angkaLain = nilaiBaru.angkaLain;
        nilaiBaru.angkaLain = newNode;
    }

    public void printList() {
        Node temp = angkaTerbesar;
        while (temp != null) {
            System.out.print(temp.dataAngka + " ");
            temp = temp.angkaLain;
        }
    }

    public void sortList() {
        Node current = angkaTerbesar, index;
        int temp;
        if (angkaTerbesar == null) {
        } else {
            while (current != null) {
                index = current.angkaLain;
                while (index != null) {
                    if (current.dataAngka > index.dataAngka) {
                        temp = current.dataAngka;
                        current.dataAngka = index.dataAngka;
                        index.dataAngka = temp;
                    }
                    index = index.angkaLain;
                }
                current = current.angkaLain;
            }
        }
    }

    private static class Node {
        int dataAngka;
        Node angkaLain;

        public Node(int dataNilai) {
            this.dataAngka = dataNilai;
            angkaLain = null;
        }
    }
}