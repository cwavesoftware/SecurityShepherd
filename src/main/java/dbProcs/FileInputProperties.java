package dbProcs;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Locates the database Properties File for Database manipulation methods. This file contains the
 * application sign on credentials for the database. <br>
 * <br>
 * This file is part of the Security Playground Project.
 *
 * <p>The Security Playground project is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.<br>
 *
 * <p>The Security Playground project is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. See the GNU General Public License for more details.<br>
 *
 * <p>You should have received a copy of the GNU General Public License along with the Security
 * Playground project. If not, see <http://www.gnu.org/licenses/>.
 *
 * @author Mark
 */
public class FileInputProperties {

  public static String readPropFileClassLoader(String filename, String property)
      throws IOException {

    InputStream input = FileInputProperties.class.getClassLoader().getResourceAsStream(filename);
    Properties prop = new Properties();
    prop.load(input);

    return prop.getProperty(property);
  }
}
