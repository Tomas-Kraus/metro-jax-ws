/*
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package fromjava.exception_mapping.server;

import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * @author Rama Pulavarthi
 */
@XmlType(name = "EchoException", namespace = "http://server.exception_mapping.fromjava/", propOrder = {
    "detail" })
public class EchoException extends Exception {
    String detail;

    public EchoException (String message, String detail) {
        super (message);
        this.detail = detail;
    }

    public String getDetail () {
        return detail;
    }
}
