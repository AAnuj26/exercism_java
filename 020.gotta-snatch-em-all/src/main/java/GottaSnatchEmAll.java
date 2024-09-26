import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        if (!collection.contains(card)) {
            collection.add(card);
            return true;
        } else {
            return false;
        }
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean iHaveExtraCard = myCollection.stream().anyMatch(card -> !theirCollection.contains(card));

        boolean theyHaveExtraCard = theirCollection.stream().anyMatch(card -> !myCollection.contains(card));

        return iHaveExtraCard && theyHaveExtraCard;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) {
            return new HashSet<>();
        }

        Set<String> common = new HashSet<>(collections.get(0));

        for (Set<String> collection : collections) {
            common.retainAll(collection);
        }

        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();
        for (Set<String> collection : collections) {
            allCards.addAll(collection);
        }
        return allCards;
    }
}
