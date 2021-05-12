package dfs;

import java.util.ArrayList;
import java.util.List;


public class Tiefensuche extends BaseTree<Film> {

	@Override
	/**
	 * Sortierkriterium im Baum: Laenge des Films
	 */
	protected int compare(Film a, Film b) {
		if (a.getLaenge() == b.getLaenge())
			return 0;
		else if (a.getLaenge() > b.getLaenge())
			return 1;
		else
			return -1;
	}

	/**
	 * Retourniert die Titelliste der Film-Knoten des Teilbaums in symmetrischer Folge (engl. in-order, d.h. links-Knoten-rechts)
	 * @param node Wurzelknoten des Teilbaums
	 * @return Liste der Titel in symmetrischer Reihenfolge
	 */
	public List<String> getNodesInOrder(Node<Film> node) {

		node.getValue().getTitel();
		node.getValue().getLaenge();

		List<String> list = new ArrayList<>();
		list.addAll(getNodesInOrder(node));

		return list;
	}
	
	/**
	 * Retourniert Titelliste jener Filme, deren Laenge zwischen min und max liegt, in Hauptreihenfolge (engl. pre-order, d.h. Knoten-links-rechts)
	 * @param min Minimale Laenge des Spielfilms
	 * @param max Maximale Laenge des Spielfilms
	 * @return Liste der Filmtitel in Hauptreihenfolge
	 */
	public List<String> getMinMaxPreOrder(Node<Film> node, double min, double max) {



		List<String> list = new ArrayList<>();
		list.addAll(getMinMaxPreOrder(node, min, max));

		return list;
	}

}
