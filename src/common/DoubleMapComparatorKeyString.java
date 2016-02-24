/*
 TagRecommender:
 A framework to implement and evaluate algorithms for the recommendation
 of tags.
 Copyright (C) 2013 Dominik Kowald
 
 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU Affero General Public License as
 published by the Free Software Foundation, either version 3 of the
 License, or (at your option) any later version.
 
 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Affero General Public License for more details.
 
 You should have received a copy of the GNU Affero General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package common;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DoubleMapComparatorKeyString implements Comparator<String> {

	private Map<String, Double> map;
	
	public DoubleMapComparatorKeyString(Map<String, Double> map) {
		this.map = map;
	}

	@Override
	public int compare(String key1, String key2) {
        Double val1 = this.map.get(key1);
        Double val2 = this.map.get(key2);
        if (val1 != null && val2 != null) {
        	return (val1 >= val2 ? - 1 : 1);
        }
        return 0;
	}
}