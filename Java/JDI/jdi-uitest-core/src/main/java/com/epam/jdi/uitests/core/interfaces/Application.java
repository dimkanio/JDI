package com.epam.jdi.uitests.core.interfaces;
/*
 * Copyright 2004-2016 EPAM Systems
 *
 * This file is part of JDI project.
 *
 * JDI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JDI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JDI. If not, see <http://www.gnu.org/licenses/>.
 */


import com.epam.jdi.uitests.core.preconditions.IPreconditions;
import com.epam.jdi.uitests.core.preconditions.PreconditionsState;
import com.epam.jdi.uitests.core.settings.JDISettings;

import java.lang.reflect.Method;

import static com.epam.jdi.uitests.core.settings.JDISettings.*;

/**
 * Created by Roman_Iovlev on 8/30/2015.
 */
public class Application {
    public static Class currentSite;

    private String driverName;
    public void setDriverName(String driverName) { this.driverName = driverName; }

    public synchronized void isInState(IPreconditions precondition) {
        driverFactory.setCurrentDriver(driverName);
        PreconditionsState.isInState(precondition);
    }
    public synchronized void isInState(IPreconditions precondition, Method method) {
        driverFactory.setCurrentDriver(driverName);
        PreconditionsState.isInState(precondition, method);
    }

}