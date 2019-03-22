/*
 * Copyright (c) 2002-2019 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.driver.internal.messaging.request;

public class DiscardNMessage extends AbstractHandleNMessage
{
    public final static byte SIGNATURE = 0x2F;

    public static DiscardNMessage newDiscardAllMessage( long id )
    {
        return new DiscardNMessage( PULL_OR_DISCARD_ALL_N_VALUE, id );
    }

    public DiscardNMessage( long n, long id )
    {
        super( n, id );
    }

    @Override
    protected String name()
    {
        return "DISCARD_N";
    }

    @Override
    public byte signature()
    {
        return SIGNATURE;
    }
}