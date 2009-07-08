package fix.test;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * To add default class tags.
 *
 * @author Administrator
 * @version $Id: $
 * @since 1.0
 */
public class ClassWithJavadoc
    implements InterfaceWithJavadoc
{
    /**
     * Constructor comment.
     */
    public ClassWithJavadoc()
    {
    }

    /**
     * The main method
     *
     * @param args      an array of strings that contains the arguments
     */
    public void spacesInJavadocTags( String[] args )
    {
    }

    /**
     * <p>missingJavadocTags</p>
     *
     * @param str a {@link java.lang.String} object.
     * @param b a boolean.
     * @param i a int.
     * @return a {@link java.lang.String} object.
     */
    public String missingJavadocTags( String str, boolean b, int i )
    {
        return null;
    }

    /**
     * <p>missingJavadocTags2</p>
     *
     * @param str a {@link java.lang.String} object.
     * @throws java.lang.UnsupportedOperationException if any
     * @param b a boolean.
     * @param i a int.
     * @return a {@link java.lang.String} object.
     */
    public String missingJavadocTags2( String str, boolean b, int i )
        throws UnsupportedOperationException
    {
        return null;
    }

    /**
     * <p>wrongJavadocTag</p>
     *
     * @param aString a {@link java.lang.String} object.
     */
    public void wrongJavadocTag( String aString )
    {
    }

    /**
     * <p>multiLinesJavadocTags</p>
     *
     * @param aString
     *      a string
     * @param anotherString
     *      with
     *      multi
     *      line
     *      comments
     * @return a
     *      String
     * @throws java.lang.UnsupportedOperationException
     *      if any
     */
    public String multiLinesJavadocTags( String aString, String anotherString )
        throws UnsupportedOperationException
    {
        return null;
    }

    /**
     * To take care of the Javadoc indentation.
     *
     * @param aString a
     *      String
     * @return dummy
     *      value
     */
    public String wrongJavadocIndentation( String aString )
    {
        return null;
    }

    // one single comment
    /**
     * To take care of single comments.
     *
     * @param aString a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    // other single comment
    public String singleComments( String aString )
    {
        return null;
    }

    // ----------------------------------------------------------------------
    // Inheritance
    // ----------------------------------------------------------------------

    /** {@inheritDoc} */
    public void method1( String aString )
    {
    }

    /**
     * {@inheritDoc}
     *
     * specific comment
     */
    public void method2( String aString )
    {
    }

    /** {@inheritDoc} */
    public String method3( String aString )
    {
        return null;
    }

    /** {@inheritDoc} */
    public String method4( String aString )
    {
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * Specific comment
     */
    public String method5( String aString )
    {
        return null;
    }

    // ----------------------------------------------------------------------
    // Inner classes
    // ----------------------------------------------------------------------

    /**
     * No javadoc for inner class.
     */
    public class InnerClass
    {
        /**
         * constructor
         */
        public InnerClass()
        {
        }

        public void nothing()
        {
        }
    }
}
