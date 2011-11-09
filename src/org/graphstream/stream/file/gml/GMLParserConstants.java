/*
 * Copyright 2006 - 2011 
 *     Stefan Balev 	<stefan.balev@graphstream-project.org>
 *     Julien Baudry	<julien.baudry@graphstream-project.org>
 *     Antoine Dutot	<antoine.dutot@graphstream-project.org>
 *     Yoann Pigné		<yoann.pigne@graphstream-project.org>
 *     Guilhelm Savin	<guilhelm.savin@graphstream-project.org>
 * 
 * This file is part of GraphStream <http://graphstream-project.org>.
 * 
 * GraphStream is a library whose purpose is to handle static or dynamic
 * graph, create them from scratch, file or any source and display them.
 * 
 * This program is free software distributed under the terms of two licenses, the
 * CeCILL-C license that fits European law, and the GNU Lesser General Public
 * License. You can  use, modify and/ or redistribute the software under the terms
 * of the CeCILL-C license as circulated by CEA, CNRS and INRIA at the following
 * URL <http://www.cecill.info> or under the terms of the GNU LGPL as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C and LGPL licenses and that you accept their terms.
 */
package org.graphstream.stream.file.gml;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface GMLParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int EOL = 5;
  /** RegularExpression Id. */
  int DIGIT = 6;
  /** RegularExpression Id. */
  int HEXDIGIT = 7;
  /** RegularExpression Id. */
  int LSQBR = 8;
  /** RegularExpression Id. */
  int RSQBR = 9;
  /** RegularExpression Id. */
  int REAL = 10;
  /** RegularExpression Id. */
  int STRING = 11;
  /** RegularExpression Id. */
  int GRAPH = 12;
  /** RegularExpression Id. */
  int DIGRAPH = 13;
  /** RegularExpression Id. */
  int KEY = 14;
  /** RegularExpression Id. */
  int COMMENT = 15;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "<EOL>",
    "<DIGIT>",
    "<HEXDIGIT>",
    "\"[\"",
    "\"]\"",
    "<REAL>",
    "<STRING>",
    "\"graph\"",
    "\"digraph\"",
    "<KEY>",
    "<COMMENT>",
  };

}
