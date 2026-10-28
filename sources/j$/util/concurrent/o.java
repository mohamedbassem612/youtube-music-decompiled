package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class o extends j {
    public static final j$.sun.misc.a h;
    public static final long i;
    public p e;
    public volatile p f;
    public volatile Thread g;
    volatile int lockState;

    static {
        j$.sun.misc.a aVar = j$.sun.misc.a.b;
        h = aVar;
        i = aVar.a(o.class, "lockState");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a A[PHI: r7
      0x004a: PHI (r7v3 java.lang.Class<?>) = (r7v2 java.lang.Class<?>), (r7v4 java.lang.Class<?>) binds: [B:23:0x0048, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    public o(p pVar) {
        int i2;
        super(-2, null, null);
        this.f = pVar;
        p pVar2 = null;
        while (pVar != null) {
            p pVar3 = (p) pVar.d;
            pVar.g = null;
            pVar.f = null;
            if (pVar2 == null) {
                pVar.e = null;
                pVar.i = false;
            } else {
                Object obj = pVar.b;
                int i3 = pVar.a;
                p pVar4 = pVar2;
                Class<?> clsC = null;
                while (true) {
                    Object obj2 = pVar4.b;
                    int i4 = pVar4.a;
                    if (i4 > i3) {
                        i2 = -1;
                    } else if (i4 < i3) {
                        i2 = 1;
                    } else if (clsC == null && (clsC = ConcurrentHashMap.c(obj)) == null) {
                        i2 = i(obj, obj2);
                    } else {
                        int i5 = ConcurrentHashMap.g;
                        int iCompareTo = (obj2 == null || obj2.getClass() != clsC) ? 0 : ((Comparable) obj).compareTo(obj2);
                        if (iCompareTo == 0) {
                            i2 = i(obj, obj2);
                        } else {
                            i2 = iCompareTo;
                        }
                    }
                    p pVar5 = i2 <= 0 ? pVar4.f : pVar4.g;
                    if (pVar5 == null) {
                        break;
                    } else {
                        pVar4 = pVar5;
                    }
                }
                pVar.e = pVar4;
                if (i2 <= 0) {
                    pVar4.f = pVar;
                } else {
                    pVar4.g = pVar;
                }
                pVar = c(pVar2, pVar);
            }
            pVar2 = pVar;
            pVar = pVar3;
        }
        this.e = pVar2;
    }

    public static p b(p pVar, p pVar2) {
        while (pVar2 != null && pVar2 != pVar) {
            p pVar3 = pVar2.e;
            if (pVar3 == null) {
                pVar2.i = false;
                return pVar2;
            }
            if (pVar2.i) {
                pVar2.i = false;
                return pVar;
            }
            p pVar4 = pVar3.f;
            if (pVar4 == pVar2) {
                p pVar5 = pVar3.g;
                if (pVar5 != null && pVar5.i) {
                    pVar5.i = false;
                    pVar3.i = true;
                    pVar = g(pVar, pVar3);
                    pVar3 = pVar2.e;
                    pVar5 = pVar3 == null ? null : pVar3.g;
                }
                if (pVar5 != null) {
                    p pVar6 = pVar5.f;
                    p pVar7 = pVar5.g;
                    if ((pVar7 == null || !pVar7.i) && (pVar6 == null || !pVar6.i)) {
                        pVar5.i = true;
                    } else {
                        if (pVar7 == null || !pVar7.i) {
                            if (pVar6 != null) {
                                pVar6.i = false;
                            }
                            pVar5.i = true;
                            pVar = h(pVar, pVar5);
                            pVar3 = pVar2.e;
                            pVar5 = pVar3 != null ? pVar3.g : null;
                        }
                        if (pVar5 != null) {
                            pVar5.i = pVar3 == null ? false : pVar3.i;
                            p pVar8 = pVar5.g;
                            if (pVar8 != null) {
                                pVar8.i = false;
                            }
                        }
                        if (pVar3 != null) {
                            pVar3.i = false;
                            pVar = g(pVar, pVar3);
                        }
                        pVar2 = pVar;
                    }
                }
                pVar2 = pVar3;
            } else {
                if (pVar4 != null && pVar4.i) {
                    pVar4.i = false;
                    pVar3.i = true;
                    pVar = h(pVar, pVar3);
                    pVar3 = pVar2.e;
                    pVar4 = pVar3 == null ? null : pVar3.f;
                }
                if (pVar4 != null) {
                    p pVar9 = pVar4.f;
                    p pVar10 = pVar4.g;
                    if ((pVar9 == null || !pVar9.i) && (pVar10 == null || !pVar10.i)) {
                        pVar4.i = true;
                    } else {
                        if (pVar9 == null || !pVar9.i) {
                            if (pVar10 != null) {
                                pVar10.i = false;
                            }
                            pVar4.i = true;
                            pVar = g(pVar, pVar4);
                            pVar3 = pVar2.e;
                            pVar4 = pVar3 != null ? pVar3.f : null;
                        }
                        if (pVar4 != null) {
                            pVar4.i = pVar3 == null ? false : pVar3.i;
                            p pVar11 = pVar4.f;
                            if (pVar11 != null) {
                                pVar11.i = false;
                            }
                        }
                        if (pVar3 != null) {
                            pVar3.i = false;
                            pVar = h(pVar, pVar3);
                        }
                        pVar2 = pVar;
                    }
                }
                pVar2 = pVar3;
            }
        }
        return pVar;
    }

    public static p c(p pVar, p pVar2) {
        p pVar3;
        pVar2.i = true;
        while (true) {
            p pVar4 = pVar2.e;
            if (pVar4 == null) {
                pVar2.i = false;
                return pVar2;
            }
            if (!pVar4.i || (pVar3 = pVar4.e) == null) {
                return pVar;
            }
            p pVar5 = pVar3.f;
            if (pVar4 == pVar5) {
                p pVar6 = pVar3.g;
                if (pVar6 == null || !pVar6.i) {
                    if (pVar2 == pVar4.g) {
                        pVar = g(pVar, pVar4);
                        p pVar7 = pVar4.e;
                        pVar3 = pVar7 == null ? null : pVar7.e;
                        pVar4 = pVar7;
                        pVar2 = pVar4;
                    }
                    if (pVar4 != null) {
                        pVar4.i = false;
                        if (pVar3 != null) {
                            pVar3.i = true;
                            pVar = h(pVar, pVar3);
                        }
                    }
                } else {
                    pVar6.i = false;
                    pVar4.i = false;
                    pVar3.i = true;
                    pVar2 = pVar3;
                }
            } else if (pVar5 == null || !pVar5.i) {
                if (pVar2 == pVar4.f) {
                    pVar = h(pVar, pVar4);
                    p pVar8 = pVar4.e;
                    pVar3 = pVar8 == null ? null : pVar8.e;
                    pVar4 = pVar8;
                    pVar2 = pVar4;
                }
                if (pVar4 != null) {
                    pVar4.i = false;
                    if (pVar3 != null) {
                        pVar3.i = true;
                        pVar = g(pVar, pVar3);
                    }
                }
            } else {
                pVar5.i = false;
                pVar4.i = false;
                pVar3.i = true;
                pVar2 = pVar3;
            }
        }
    }

    public static p g(p pVar, p pVar2) {
        p pVar3;
        if (pVar2 != null && (pVar3 = pVar2.g) != null) {
            p pVar4 = pVar3.f;
            pVar2.g = pVar4;
            if (pVar4 != null) {
                pVar4.e = pVar2;
            }
            p pVar5 = pVar2.e;
            pVar3.e = pVar5;
            if (pVar5 == null) {
                pVar3.i = false;
                pVar = pVar3;
            } else if (pVar5.f == pVar2) {
                pVar5.f = pVar3;
            } else {
                pVar5.g = pVar3;
            }
            pVar3.f = pVar2;
            pVar2.e = pVar3;
        }
        return pVar;
    }

    public static p h(p pVar, p pVar2) {
        p pVar3;
        if (pVar2 != null && (pVar3 = pVar2.f) != null) {
            p pVar4 = pVar3.g;
            pVar2.f = pVar4;
            if (pVar4 != null) {
                pVar4.e = pVar2;
            }
            p pVar5 = pVar2.e;
            pVar3.e = pVar5;
            if (pVar5 == null) {
                pVar3.i = false;
                pVar = pVar3;
            } else if (pVar5.g == pVar2) {
                pVar5.g = pVar3;
            } else {
                pVar5.f = pVar3;
            }
            pVar3.g = pVar2;
            pVar2.e = pVar3;
        }
        return pVar;
    }

    public static int i(Object obj, Object obj2) {
        int iCompareTo;
        if (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return iCompareTo;
    }

    @Override // j$.util.concurrent.j
    public final j a(int i2, Object obj) {
        int intVolatile;
        Thread thread;
        int intVolatile2;
        Thread thread2;
        j jVar = this.f;
        while (true) {
            j jVar2 = jVar;
            while (jVar2 != null) {
                int i3 = this.lockState;
                if ((i3 & 3) != 0) {
                    if (jVar2.a == i2) {
                        Object obj2 = jVar2.b;
                        if (obj2 == obj) {
                            return jVar2;
                        }
                        if (obj2 != null && obj.equals(obj2)) {
                            return jVar2;
                        }
                    }
                    jVar = jVar2.d;
                } else {
                    j$.sun.misc.a aVar = h;
                    long j = i;
                    if (aVar.a.compareAndSwapInt(this, j, i3, i3 + 4)) {
                        try {
                            p pVar = this.e;
                            p pVarB = pVar == null ? null : pVar.b(i2, obj, null);
                            do {
                                intVolatile2 = aVar.a.getIntVolatile(this, j);
                            } while (!aVar.a.compareAndSwapInt(this, j, intVolatile2, intVolatile2 - 4));
                            if (intVolatile2 != 6 || (thread2 = this.g) == null) {
                                return pVarB;
                            }
                            LockSupport.unpark(thread2);
                            return pVarB;
                        } catch (Throwable th) {
                            j$.sun.misc.a aVar2 = h;
                            long j2 = i;
                            do {
                                intVolatile = aVar2.a.getIntVolatile(this, j2);
                            } while (!aVar2.a.compareAndSwapInt(this, j2, intVolatile, intVolatile - 4));
                            if (intVolatile != 6 || (thread = this.g) == null) {
                                throw th;
                            }
                            LockSupport.unpark(thread);
                            throw th;
                        }
                    }
                }
            }
            return null;
        }
    }

    public final void d() {
        j$.sun.misc.a aVar = h;
        if (aVar.a.compareAndSwapInt(this, i, 0, 1)) {
            return;
        }
        boolean z = false;
        while (true) {
            int i2 = this.lockState;
            if ((i2 & (-3)) == 0) {
                j$.sun.misc.a aVar2 = h;
                if (aVar2.a.compareAndSwapInt(this, i, i2, 1)) {
                    break;
                }
            } else if ((i2 & 2) == 0) {
                if (h.a.compareAndSwapInt(this, i, i2, i2 | 2)) {
                    this.g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.g = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b A[PHI: r0
      0x003b: PHI (r0v3 java.lang.Class<?>) = (r0v2 java.lang.Class<?>), (r0v5 java.lang.Class<?>) binds: [B:16:0x0032, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050 A[PHI: r0
      0x0050: PHI (r0v4 java.lang.Class<?>) = (r0v3 java.lang.Class<?>), (r0v5 java.lang.Class<?>) binds: [B:25:0x004e, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    public final p e(int i2, Object obj, Object obj2) {
        int iCompareTo;
        int i3;
        p pVar;
        p pVar2;
        p pVarB;
        p pVar3 = this.e;
        Class<?> cls = null;
        boolean z = false;
        while (pVar3 != null) {
            int i4 = i2;
            Object obj3 = obj;
            Object obj4 = obj2;
            int i5 = pVar3.a;
            if (i5 > i4) {
                i3 = -1;
            } else if (i5 < i4) {
                i3 = 1;
            } else {
                Object obj5 = pVar3.b;
                if (obj5 == obj3 || (obj5 != null && obj3.equals(obj5))) {
                    return pVar3;
                }
                if (cls == null) {
                    Class<?> clsC = ConcurrentHashMap.c(obj3);
                    cls = clsC;
                    if (clsC != null) {
                        int i6 = ConcurrentHashMap.g;
                        if (obj5 == null && obj5.getClass() == cls) {
                            iCompareTo = ((Comparable) obj3).compareTo(obj5);
                        } else {
                            iCompareTo = 0;
                        }
                        if (iCompareTo == 0) {
                            if (!z) {
                                pVar = pVar3.f;
                                if ((pVar == null && (pVarB = pVar.b(i4, obj3, cls)) != null) || ((pVar2 = pVar3.g) != null && (pVarB = pVar2.b(i4, obj3, cls)) != null)) {
                                    return pVarB;
                                }
                            }
                            i3 = i(obj3, obj5);
                        } else {
                            i3 = iCompareTo;
                        }
                    } else {
                        if (!z) {
                            pVar = pVar3.f;
                            z = pVar == null ? true : true;
                            return pVarB;
                        }
                        i3 = i(obj3, obj5);
                    }
                } else {
                    int i7 = ConcurrentHashMap.g;
                    if (obj5 == null) {
                        iCompareTo = 0;
                    } else {
                        iCompareTo = 0;
                    }
                    if (iCompareTo == 0) {
                        if (!z) {
                            pVar = pVar3.f;
                            if (pVar == null) {
                            }
                            return pVarB;
                        }
                        i3 = i(obj3, obj5);
                    } else {
                        i3 = iCompareTo;
                    }
                }
            }
            p pVar4 = i3 <= 0 ? pVar3.f : pVar3.g;
            if (pVar4 == null) {
                p pVar5 = this.f;
                p pVar6 = new p(i4, obj3, obj4, pVar5, pVar3);
                this.f = pVar6;
                if (pVar5 != null) {
                    pVar5.h = pVar6;
                }
                if (i3 <= 0) {
                    pVar3.f = pVar6;
                } else {
                    pVar3.g = pVar6;
                }
                if (!pVar3.i) {
                    pVar6.i = true;
                    return null;
                }
                d();
                try {
                    this.e = c(this.e, pVar6);
                    return null;
                } finally {
                    this.lockState = 0;
                }
            }
            pVar3 = pVar4;
            i2 = i4;
            obj = obj3;
            obj2 = obj4;
        }
        p pVar7 = new p(i2, obj, obj2, null, null);
        this.e = pVar7;
        this.f = pVar7;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0086 A[PHI: r0
      0x0086: PHI (r0v11 j$.util.concurrent.p) = (r0v3 j$.util.concurrent.p), (r0v12 j$.util.concurrent.p) binds: [B:50:0x0082, B:48:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean f(p pVar) {
        p pVar2;
        p pVar3;
        p pVar4 = (p) pVar.d;
        p pVar5 = pVar.h;
        if (pVar5 == null) {
            this.f = pVar4;
        } else {
            pVar5.d = pVar4;
        }
        if (pVar4 != null) {
            pVar4.h = pVar5;
        }
        boolean z = true;
        z = true;
        z = true;
        z = true;
        if (this.f == null) {
            this.e = null;
            return true;
        }
        p pVarB = this.e;
        if (pVarB != null && pVarB.g != null && (pVar2 = pVarB.f) != null && pVar2.f != null) {
            d();
            int i2 = 0;
            z = false;
            try {
                p pVar6 = pVar.f;
                p pVar7 = pVar.g;
                if (pVar6 != null) {
                    if (pVar7 != null) {
                        p pVar8 = pVar7;
                        while (true) {
                            p pVar9 = pVar8.f;
                            if (pVar9 == null) {
                                break;
                            }
                            pVar8 = pVar9;
                        }
                        boolean z2 = pVar8.i;
                        pVar8.i = pVar.i;
                        pVar.i = z2;
                        p pVar10 = pVar8.g;
                        p pVar11 = pVar.e;
                        if (pVar8 == pVar7) {
                            pVar.e = pVar8;
                            pVar8.g = pVar;
                        } else {
                            p pVar12 = pVar8.e;
                            pVar.e = pVar12;
                            if (pVar12 != null) {
                                if (pVar8 == pVar12.f) {
                                    pVar12.f = pVar;
                                } else {
                                    pVar12.g = pVar;
                                }
                            }
                            pVar8.g = pVar7;
                            pVar7.e = pVar8;
                        }
                        pVar.f = null;
                        pVar.g = pVar10;
                        if (pVar10 != null) {
                            pVar10.e = pVar;
                        }
                        pVar8.f = pVar6;
                        pVar6.e = pVar8;
                        pVar8.e = pVar11;
                        if (pVar11 == null) {
                            pVarB = pVar8;
                        } else if (pVar == pVar11.f) {
                            pVar11.f = pVar8;
                        } else {
                            pVar11.g = pVar8;
                        }
                        if (pVar10 != null) {
                            pVar6 = pVar10;
                        } else {
                            pVar6 = pVar;
                        }
                    }
                } else if (pVar7 != null) {
                    pVar6 = pVar7;
                } else {
                    pVar6 = pVar;
                }
                if (pVar6 != pVar) {
                    p pVar13 = pVar.e;
                    pVar6.e = pVar13;
                    if (pVar13 == null) {
                        pVarB = pVar6;
                    } else if (pVar == pVar13.f) {
                        pVar13.f = pVar6;
                    } else {
                        pVar13.g = pVar6;
                    }
                    pVar.e = null;
                    pVar.g = null;
                    pVar.f = null;
                }
                if (!pVar.i) {
                    pVarB = b(pVarB, pVar6);
                }
                this.e = pVarB;
                if (pVar == pVar6 && (pVar3 = pVar.e) != null) {
                    if (pVar == pVar3.f) {
                        pVar3.f = null;
                    } else if (pVar == pVar3.g) {
                        pVar3.g = null;
                    }
                    pVar.e = null;
                }
            } finally {
                this.lockState = 0;
            }
        }
        return z;
    }
}
