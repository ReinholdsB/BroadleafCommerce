/*
 * #%L
 * BroadleafCommerce Framework
 * %%
 * Copyright (C) 2009 - 2013 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.core.order.domain;

import java.util.List;


public interface OrderItemContainer {

    List<? extends OrderItem> getOrderItems();

    /**
     * Returns true if the contained items can be discounted.
     * @return
     */
    boolean getAllowDiscountsOnChildItems();

    /**
     * Returns true if pricing operations are at the container level (as opposed to being
     * the sum of the contained items) 
     * @return
     */
    boolean isPricingAtContainerLevel();
}
