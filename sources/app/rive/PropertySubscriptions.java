package app.rive;

import app.rive.core.CommandQueue;
import defpackage.atqq;
import defpackage.awqx;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class PropertySubscriptions {
    private boolean closed;
    private final Map collectorCounts;
    private final long instanceHandle;
    private final CommandQueue riveWorker;

    private PropertySubscriptions(CommandQueue commandQueue, long j) {
        commandQueue.getClass();
        this.riveWorker = commandQueue;
        this.instanceHandle = j;
        this.collectorCounts = new LinkedHashMap();
    }

    public final synchronized boolean acquire(PropertySubscriptionKey propertySubscriptionKey) {
        propertySubscriptionKey.getClass();
        int i = 0;
        if (this.closed) {
            return false;
        }
        Integer num = (Integer) this.collectorCounts.get(propertySubscriptionKey);
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == 0) {
            this.riveWorker.m482subscribeToPropertyiFQtAB8(this.instanceHandle, propertySubscriptionKey.getPropertyPath(), propertySubscriptionKey.getPropertyType());
        } else {
            i = iIntValue;
        }
        this.collectorCounts.put(propertySubscriptionKey, Integer.valueOf(i + 1));
        return true;
    }

    public final synchronized void closeAll() {
        if (!this.closed) {
            this.closed = true;
            List<PropertySubscriptionKey> listAp = atqq.ap(this.collectorCounts.keySet());
            this.collectorCounts.clear();
            RuntimeException runtimeException = null;
            for (PropertySubscriptionKey propertySubscriptionKey : listAp) {
                try {
                    this.riveWorker.m485unsubscribeFromPropertyiFQtAB8(this.instanceHandle, propertySubscriptionKey.getPropertyPath(), propertySubscriptionKey.getPropertyType());
                } catch (RuntimeException e) {
                    if (runtimeException == null) {
                        runtimeException = e;
                    }
                }
            }
            if (runtimeException != null) {
                throw runtimeException;
            }
        }
    }

    public final synchronized void release(PropertySubscriptionKey propertySubscriptionKey) {
        Integer num;
        propertySubscriptionKey.getClass();
        if (this.closed || (num = (Integer) this.collectorCounts.get(propertySubscriptionKey)) == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 1) {
            this.collectorCounts.put(propertySubscriptionKey, Integer.valueOf(iIntValue - 1));
        } else {
            this.riveWorker.m485unsubscribeFromPropertyiFQtAB8(this.instanceHandle, propertySubscriptionKey.getPropertyPath(), propertySubscriptionKey.getPropertyType());
            this.collectorCounts.remove(propertySubscriptionKey);
        }
    }

    public /* synthetic */ PropertySubscriptions(CommandQueue commandQueue, long j, awqx awqxVar) {
        this(commandQueue, j);
    }
}
