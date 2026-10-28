package defpackage;

import app.rive.semantics.SemanticState;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tcb implements tbs {
    final Map a = new HashMap(SemanticState.Hidden);
    private final ReadWriteLock b = new ReentrantReadWriteLock();

    @Override // defpackage.tbs
    public final tbv[] a(Object obj, Class cls, Object obj2) {
        Set setV;
        Set<tca> setV2;
        this.b.readLock().lock();
        try {
            Map map = this.a;
            int i = 0;
            if (map.containsKey(cls)) {
                setV2 = tym.V(map, cls);
                this.b.readLock().unlock();
            } else {
                ReadWriteLock readWriteLock = this.b;
                readWriteLock.readLock().unlock();
                Method[] declaredMethods = cls.getDeclaredMethods();
                readWriteLock.writeLock().lock();
                try {
                    Map map2 = this.a;
                    if (map2.containsKey(cls)) {
                        setV = tym.V(map2, cls);
                    } else {
                        for (Method method : declaredMethods) {
                            if (method.isAnnotationPresent(tcc.class)) {
                                Class<?>[] parameterTypes = method.getParameterTypes();
                                if (parameterTypes.length != 1) {
                                    throw new IllegalArgumentException("Event handler methods can only take a single event argument.");
                                }
                                tym.W(map2, cls, new tca(parameterTypes[0], method));
                            }
                        }
                        setV = tym.V(map2, cls);
                    }
                    readWriteLock.writeLock().unlock();
                    setV2 = setV;
                } catch (Throwable th) {
                    this.b.writeLock().unlock();
                    throw th;
                }
            }
            if (setV2.isEmpty()) {
                throw new IllegalArgumentException(String.format("Class %s does not contain any methods annotated with @Subscribe", cls.getName()));
            }
            tbv[] tbvVarArr = new tbv[setV2.size()];
            for (tca tcaVar : setV2) {
                tbvVarArr[i] = new tbv(obj, tcaVar.a, obj2, new tbz(obj, tcaVar.b));
                i++;
            }
            return tbvVarArr;
        } catch (Throwable th2) {
            this.b.readLock().unlock();
            throw th2;
        }
    }
}
