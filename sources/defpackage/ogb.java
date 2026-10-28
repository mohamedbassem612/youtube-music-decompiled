package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ogb implements Handler.Callback {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public ogb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:0: B:37:0x009a->B:62:?, LOOP_END, SYNTHETIC] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ArrayList arrayList;
        dii diiVar;
        int size;
        dii diiVar2;
        int i = this.$cid;
        int i2 = 0;
        if (i != 0) {
            int i3 = 2;
            if (i != 1) {
                taq.d();
                Object obj = this.a;
                yab yabVar = (yab) obj;
                xze xzeVar = yabVar.g;
                if (xzeVar != null) {
                    if (yabVar.l.ar()) {
                        tfq tfqVar = yabVar.m;
                        if (tfqVar.i() && (!yabVar.e || tfqVar.j(1))) {
                            arrayList = new ArrayList();
                            if (message.what == 2) {
                                diiVar = (dii) message.obj;
                            } else {
                                diiVar = null;
                            }
                            if (diiVar == null) {
                                arrayList.addAll(dij.i());
                            } else {
                                arrayList.add(diiVar);
                            }
                            size = arrayList.size();
                            while (i2 < size) {
                                diiVar2 = (dii) arrayList.get(i2);
                                i2++;
                                if (xsa.b(diiVar2.d, xzeVar.c)) {
                                    yabVar.b(diiVar2);
                                    break;
                                }
                            }
                        } else if (!yabVar.h) {
                            agrx agrxVar = agso.a;
                            yabVar.j.c(yabVar.i.P().x(new wsh(obj, i3)).L(yabVar.k).ak(new xul(obj, 10)));
                            yabVar.h = true;
                        }
                    } else if (!yabVar.e || yabVar.m.j(1)) {
                        arrayList = new ArrayList();
                        if (message.what == 2) {
                            diiVar = (dii) message.obj;
                        } else {
                            diiVar = null;
                        }
                        if (diiVar == null) {
                            arrayList.addAll(dij.i());
                        } else {
                            arrayList.add(diiVar);
                        }
                        size = arrayList.size();
                        while (i2 < size) {
                            diiVar2 = (dii) arrayList.get(i2);
                            i2++;
                            if (xsa.b(diiVar2.d, xzeVar.c)) {
                                yabVar.b(diiVar2);
                                break;
                            }
                        }
                    } else {
                        if (!yabVar.h) {
                            yabVar.b.f(yabVar.d);
                        }
                        yabVar.h = true;
                    }
                }
            } else {
                if (message.what != 1) {
                    if (message.what == 2) {
                        ((fcj) this.a).c.j((fci) message.obj);
                    }
                    return false;
                }
                ((fcj) this.a).c((fci) message.obj);
            }
        } else {
            ogc ogcVar = (ogc) this.a;
            Set<ofk> set = ogcVar.b;
            if (!set.isEmpty()) {
                for (ofk ofkVar : set) {
                    if (ofkVar instanceof ogh) {
                        ogcVar.b((ogh) ofkVar, ofq.POLLING_EVENT);
                    } else if (ofkVar instanceof ofn) {
                        ogcVar.e((ofn) ofkVar);
                    }
                }
                ogcVar.a.sendEmptyMessageDelayed(0, 200L);
            }
        }
        return true;
    }
}
