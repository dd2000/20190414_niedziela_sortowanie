package pl.sda.inner;

import java.util.Comparator;

class ProductComparatorsByIdReversed implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getId() - o1.getId();
    }
}

class ProductComparatorsByName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
