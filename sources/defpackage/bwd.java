package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bwd implements Handler.Callback {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ bwd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [bvq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [bvt, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        ArrayList arrayList;
        ComponentName componentName;
        afvq afvqVar;
        int i2 = this.$cid;
        if (i2 == 0) {
            int i3 = message.what;
            Object obj = this.a;
            if (i3 == 1) {
                ((bwf) ((aesp) obj).a).a();
            } else if (i3 == 2) {
                ((bwg) ((aesp) obj).b).a();
            } else {
                if (i3 != 3) {
                    if (i3 == 4) {
                        ((bwi) ((aesp) obj).g).a();
                    }
                    return false;
                }
                ((bwh) ((aesp) obj).c).a();
            }
            return true;
        }
        kra kraVar = null;
        if (i2 == 1) {
            dje djeVar = (dje) this.a;
            ?? r9 = djeVar.c;
            r9.getClass();
            for (bvu bvuVar : (CopyOnWriteArraySet) djeVar.e) {
                if (!bvuVar.c && bvuVar.b) {
                    bsb bsbVarH = bvuVar.d.h();
                    bvuVar.d = new aerz(null, null);
                    bvuVar.b = false;
                    r9.a(bvuVar.a, bsbVarH);
                }
                ?? r1 = djeVar.f;
                r1.getClass();
                if (r1.c(1)) {
                    break;
                }
            }
        } else if (i2 == 2) {
            int i4 = message.arg1;
            Object obj2 = this.a;
            synchronized (obj2) {
                SparseArray sparseArray = ((kkx) obj2).d;
                kkz kkzVar = (kkz) sparseArray.get(i4);
                if (kkzVar == null) {
                    Log.w("MessengerIpcClient", a.bR(i4, "Received response for unknown request: "));
                } else {
                    sparseArray.remove(i4);
                    ((kkx) obj2).d();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        kkzVar.c(new kla("Not supported by GmsCore", null));
                    } else {
                        kkzVar.a(data);
                    }
                }
            }
        } else if (i2 != 3) {
            int i5 = message.what;
            Object obj3 = this.a;
            if (i5 == 1) {
                afvqVar = ((adne) obj3).c;
            } else if (i5 == 2) {
                afvqVar = ((adne) obj3).d;
            } else if (i5 == 3) {
                afvqVar = ((adne) obj3).e;
            } else {
                if (i5 != 4) {
                    if (i5 == 5) {
                        afvqVar = ((adne) obj3).g;
                    }
                    return false;
                }
                afvqVar = ((adne) obj3).f;
            }
            adne adneVar = (adne) obj3;
            if (!adneVar.w(afvqVar)) {
                adneVar.a.post(new acqu(obj3, 9));
            }
        } else {
            int i6 = message.what;
            if (i6 != 0) {
                if (i6 == 1) {
                    Object obj4 = this.a;
                    HashMap map = ((kqy) obj4).d;
                    synchronized (map) {
                        khn khnVar = (khn) message.obj;
                        Object obj5 = khnVar.b;
                        kra kraVar2 = (kra) map.get(obj5);
                        i = -1;
                        if (kraVar2 != null && kraVar2 == khnVar.a && kraVar2.c == 3) {
                            Log.e("GmsClientSupervisor", a.co(obj5, "Timeout waiting for ServiceConnection callback "), new Exception());
                            componentName = kraVar2.f;
                            if (componentName == null) {
                                componentName = ((kqx) obj5).c;
                            }
                            if (componentName == null) {
                                String str = ((kqx) obj5).b;
                                kro.l(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            ((kqy) obj4).d(kraVar2);
                            kraVar2.e = null;
                            kraVar2.f = componentName;
                            kraVar2.c = 2;
                            i = kraVar2.b + 1;
                            kraVar2.b = i;
                            Map map2 = kraVar2.a;
                            ArrayList arrayList2 = new ArrayList(map2.size());
                            for (Map.Entry entry : map2.entrySet()) {
                                arrayList2.add(new AbstractMap.SimpleImmutableEntry((ServiceConnection) entry.getKey(), (ServiceConnection) entry.getValue()));
                            }
                            arrayList = arrayList2;
                            kraVar = kraVar2;
                        } else {
                            arrayList = null;
                            componentName = null;
                        }
                    }
                    if (kraVar != null) {
                        kraVar.b(arrayList, i, componentName);
                    }
                }
                return false;
            }
            HashMap map3 = ((kqy) this.a).d;
            synchronized (map3) {
                kqx kqxVar = (kqx) message.obj;
                kra kraVar3 = (kra) map3.get(kqxVar);
                if (kraVar3 != null && kraVar3.d()) {
                    if (kraVar3.d) {
                        kqy kqyVar = kraVar3.g;
                        synchronized (kqyVar.d) {
                            try {
                                kqyVar.d(kraVar3);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            kqy kqyVar2 = kraVar3.g;
                            kqyVar2.g.b(kqyVar2.e, kraVar3);
                            kraVar3.d = false;
                            kraVar3.c = 2;
                        } catch (Throwable th2) {
                            kraVar3.d = false;
                            kraVar3.c = 2;
                            throw th2;
                        }
                    }
                    map3.remove(kqxVar);
                }
            }
        }
        return true;
    }

    public bwd(kqy kqyVar, int i) {
        this.$cid = i;
        this.a = kqyVar;
    }
}
