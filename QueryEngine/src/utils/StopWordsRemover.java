/**
 * 
 */
package utils;

import java.util.HashSet;


public class StopWordsRemover {

	static String stopWords[] = { "a", "again", "about", "above", "across", "after", "against", "all", "almost", "alone",
			"along", "already", "also", "although", "always", "am", "among", "an", "and", "another", "any", "anybody",
			"anyone", "anything", "anywhere", "are", "area", "areas", "aren't", "around", "as", "ask", "asked",
			"asking", "asks", "at", "away", "b", "back", "backed", "backing", "backs", "be", "became", "because",
			"become", "becomes", "been", "before", "began", "behind", "being", "beings", "below", "best", "better",
			"between", "big", "both", "but", "by", "c", "came", "can", "can't", "cannot", "case", "cases", "certain",
			"certainly", "clear", "clearly", "com", "come", "coord", "could", "couldn't", "d", "did", "didn't",
			"differ", "different", "differently", "do", "does", "doesn't", "doing", "don't", "done", "down", "downed",
			"downing", "downs", "during", "e", "each", "early", "either", "em","end", "ended", "ending", "ends", "enough",
			"even", "evenly", "ever", "every", "everybody", "everyone", "everything", "everywhere", "f", "face",
			"faces", "fact", "facts", "far", "felt", "few", "find", "finds", "first", "for", "four", "from", "full",
			"fully", "further", "furthered", "furthering", "furthers", "g", "gave", "general", "generally", "get",
			"gets", "give", "given", "gives", "go", "going", "good", "goods", "got", "gr", "great", "greater",
			"greatest", "group", "grouped", "grouping", "groups", "h", "had", "hadn't", "has", "hasn't", "have",
			"haven't", "having", "he", "he'd", "he'll", "he's", "her", "here", "here's", "hers", "herself", "high",
			"higher", "highest", "him", "himself", "his", "how", "how's", "however", "http", "https", "i", "i'd",
			"i'll", "i'm", "i've", "if", "important", "image","in", "interest", "interested", "interesting", "interests",
			"into", "is", "isn't", "it", "it's", "its", "itself", "j", "jpg", "just", "k", "keep", "keeps", "kind",
			"knew", "know", "known", "knows", "l", "large", "largely", "last", "later", "latest", "least", "less",
			"let", "let's", "lets", "like", "likely", "long", "longer", "longest", "m", "made", "make", "making", "man",
			"many", "may", "me", "member", "members", "men", "might", "more", "most", "mostly", "mr", "mrs", "much",
			"must", "mustn't", "my", "myself", "n", "name","nbsp", "necessary", "need", "needed", "needing", "needs", "never",
			"new", "newer", "newest", "next", "no", "nobody", "non", "noone", "nor", "not", "nothing", "now", "nowhere",
			"number", "numbers", "o", "of", "off", "often", "old", "older", "oldest", "on", "once", "one", "only",
			"open", "opened", "opening", "opens", "or", "order", "ordered", "ordering", "orders", "org", "other",
			"others", "ought", "our", "ours", "ourselves", "out", "over", "own", "p", "part", "parted", "parting",
			"parts", "per", "perhaps", "place", "places", "point", "pointed", "pointing", "points", "possible",
			"present", "presented", "presenting", "presents", "problem", "problems", "put", "puts", "q", "quite", "r",
			"rather", "really", "ref", "right", "room", "rooms", "s", "said", "same", "saw", "say", "says", "second",
			"seconds", "see", "seem", "seemed", "seeming", "seems", "sees", "several", "shall", "shan't", "she",
			"she'd", "she'll", "she's", "should", "shouldn't", "show", "showed", "showing", "shows", "side", "sides",
			"since", "small", "smaller", "smallest", "so", "some", "somebody", "someone", "something", "somewhere",
			"state", "states", "still", "such", "sure", "t", "take", "taken", "td", "than", "that", "that's", "the",
			"their", "theirs", "them", "themselves", "then", "there", "there's", "therefore", "these", "they", "they'd",
			"they'll", "they're", "they've", "thing", "things", "think", "thinks", "this", "those", "though", "thought",
			"thoughts", "three", "through", "thus", "to", "today", "together", "too", "took", "toward", "tr", "turn",
			"turned", "turning", "turns", "two", "u", "under", "until", "up", "upon", "us", "use", "used", "uses", "v",
			"very", "w", "want", "wanted", "wanting", "wants", "was", "wasn't", "way", "ways", "we", "we'd", "we'll",
			"we're", "we've", "well", "wells", "went", "were", "weren't", "what", "what's", "when", "when's", "where",
			"where's", "whether", "which", "while", "who", "who's", "whole", "whom", "whose", "why", "why's", "will",
			"with", "within", "without", "won't", "work", "worked", "working", "works", "would", "wouldn't", "www", "x",
			"y", "year", "years", "yet", "you", "you'd", "you'll", "you're", "you've", "young", "younger", "youngest",
			"your", "yours", "yourself", "yourselves", "z" };
	
	
	public static HashSet<String> stopWordSet = new HashSet<String>();

	static
	{
		for (String stpWord : stopWords) 
			stopWordSet.add(stpWord);
	}
}