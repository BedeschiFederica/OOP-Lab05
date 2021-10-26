package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 */
public final class Utilities {

    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> unionSet = new HashSet<X>(setA);
        unionSet.addAll(setB);
        return unionSet;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> intersectionSet = new HashSet<X>();
        for (X elem: setA) {
        	Iterator<? extends X> i = setB.iterator();
        	while (i.hasNext()) {
        		if ((i.next()).equals(elem)) {
        			intersectionSet.add(elem);
        		}
        	}
        }
        return intersectionSet;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> intersectionSet = setIntersection(setA, setB);
        Set<X> symmetricDifferenceSet = setUnion(setA, setB);
        for (X elem: intersectionSet) {
        	symmetricDifferenceSet.remove(elem);
        }
        return symmetricDifferenceSet;
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    @SuppressWarnings("unchecked")
	public static <X> X getRandomElement(final Collection<X> coll) {
    	Object[] arr = coll.toArray();
        return (X)(arr[(int)(Math.random() * arr.length)]);
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    @SuppressWarnings("unchecked")
	public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
    	Object[] firstArr = first.toArray();
    	Object[] secondArr = second.toArray();
        return new Pair<X, Y>((X)(firstArr[(int)(Math.random() * firstArr.length)]),
        		        	  (Y)(secondArr[(int)(Math.random() * secondArr.length)]));
    }
}
