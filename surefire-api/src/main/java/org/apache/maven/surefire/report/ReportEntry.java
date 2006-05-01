package org.apache.maven.surefire.report;

/*
 * Copyright 2001-2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class ReportEntry
{
    private Object source;

    private String name;

    private String group;

    private String message;

    private StackTraceWriter stackTraceWriter;

    public ReportEntry( Object source, String name, String message )
    {
        this( source, name, null, message );
    }

    public ReportEntry( Object source, String name, String group, String message )
    {
        this( source, name, group, message, null );
    }

    public ReportEntry( Object source, String name, String message, StackTraceWriter stackTraceWriter )
    {
        this( source, name, null, message, stackTraceWriter );
    }

    public ReportEntry( Object source, String name, String group, String message, StackTraceWriter stackTraceWriter )
    {
        if ( source == null )
        {
            throw new NullPointerException( "source is null" );
        }
        if ( name == null )
        {
            throw new NullPointerException( "name is null" );
        }
        if ( message == null )
        {
            throw new NullPointerException( "message is null" );
        }

        this.source = source;

        this.name = name;

        this.group = group;

        this.message = message;

        this.stackTraceWriter = stackTraceWriter;
    }

    public Object getSource()
    {
        return source;
    }

    public String getName()
    {
        return name;
    }

    public String getGroup()
    {
        return group;
    }

    public String getMessage()
    {
        return message;
    }

    public StackTraceWriter getStackTraceWriter()
    {
        return stackTraceWriter;
    }
}
