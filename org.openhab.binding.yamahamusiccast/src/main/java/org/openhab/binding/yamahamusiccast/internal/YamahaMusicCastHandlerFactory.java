/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.yamahamusiccast.internal;

import static org.openhab.binding.yamahamusiccast.YamahaMusicCastBindingConstants.*;

import java.util.Collections;
import java.util.Set;

import org.openhab.binding.yamahamusiccast.handler.YamahaMusicCastHandler;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandlerFactory;
import org.eclipse.smarthome.core.thing.binding.ThingHandler;

/**
 * The {@link YamahaMusicCastHandlerFactory} is responsible for creating things and thing 
 * handlers.
 * 
 * @author Frank Zimmer - Initial contribution
 */
public class YamahaMusicCastHandlerFactory extends BaseThingHandlerFactory {
    
    private final static Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Collections.singleton(THING_TYPE_SPEAKER);
    
    @Override
    public boolean supportsThingType(ThingTypeUID thingTypeUID) {
        return SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID);
    }

    @Override
    protected ThingHandler createHandler(Thing thing) {

        ThingTypeUID thingTypeUID = thing.getThingTypeUID();

        if (thingTypeUID.equals(THING_TYPE_SPEAKER)) {
            return new YamahaMusicCastHandler(thing);
        }

        return null;
    }
}

