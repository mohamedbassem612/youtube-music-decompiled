package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgl extends Handler {
    final /* synthetic */ dgr a;
    private final ArrayList b = new ArrayList();
    private final List c = new ArrayList();

    public dgl(dgr dgrVar) {
        this.a = dgrVar;
    }

    final void a(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    final void b(dii diiVar, dii diiVar2, ytt yttVar, boolean z) {
        Message messageObtainMessage = obtainMessage(262, new dgq(diiVar, diiVar2, yttVar, z));
        messageObtainMessage.arg1 = yttVar.a;
        messageObtainMessage.sendToTarget();
    }

    /* JADX WARN: Code duplicated, block: B:131:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0179 A[DONT_GENERATE, SYNTHETIC] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        dii diiVar;
        dii diiVar2;
        ytt yttVar;
        int i;
        diu diuVar;
        int iQ;
        int i2 = message.what;
        Object obj = message.obj;
        int i3 = message.arg1;
        if (i2 == 259) {
            dgr dgrVar = this.a;
            if (dgrVar.f().d.equals(((dii) obj).d)) {
                dgrVar.r(true);
            }
            i2 = 259;
        }
        if (i2 == 262) {
            dgq dgqVar = (dgq) obj;
            dii diiVar3 = dgqVar.b;
            if (dgqVar.c) {
                this.a.p.u(diiVar3);
            }
            dgr dgrVar2 = this.a;
            if (dgrVar2.r != null && diiVar3.l()) {
                List list = this.c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dgrVar2.p.t((dii) it.next());
                }
                list.clear();
            }
        } else if (i2 != 264) {
            switch (i2) {
                case 257:
                    this.a.p.s((dii) obj);
                    break;
                case 258:
                    this.a.p.t((dii) obj);
                    break;
                case 259:
                    dgr dgrVar3 = this.a;
                    dii diiVar4 = (dii) obj;
                    dhp dhpVarD = diiVar4.d();
                    div divVar = dgrVar3.p;
                    if (dhpVarD != divVar && (iQ = (diuVar = (diu) divVar).q(diiVar4)) >= 0) {
                        diu.y((dit) diuVar.p.get(iQ));
                    }
                    break;
            }
        } else {
            dgq dgqVar2 = (dgq) obj;
            dii diiVar5 = dgqVar2.b;
            this.c.add(diiVar5);
            div divVar2 = this.a.p;
            divVar2.s(diiVar5);
            if (dgqVar2.c) {
                divVar2.u(diiVar5);
            }
        }
        try {
            ArrayList arrayList = this.a.i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    for (die dieVar : this.b) {
                        dij dijVar = dieVar.a;
                        azs azsVar = dieVar.e;
                        int i4 = 65280 & i2;
                        if (i4 == 256) {
                            if (i2 == 264 || i2 == 262) {
                                dgq dgqVar3 = (dgq) obj;
                                diiVar = dgqVar3.b;
                                diiVar2 = dgqVar3.a;
                                yttVar = dgqVar3.d;
                            } else {
                                diiVar = null;
                                if (i2 == 265 || i2 == 266) {
                                    eol eolVar = (eol) obj;
                                    Object obj2 = eolVar.a;
                                    Object obj3 = eolVar.b;
                                    yttVar = null;
                                    diiVar2 = null;
                                } else {
                                    diiVar2 = null;
                                    diiVar = (dii) obj;
                                    yttVar = null;
                                }
                            }
                            if (diiVar != null) {
                                if ((dieVar.c & 2) != 0 || diiVar.p(dieVar.b)) {
                                    i = i3;
                                    switch (i2) {
                                        case 257:
                                            azsVar.x(diiVar);
                                            break;
                                        case 258:
                                            azsVar.z(diiVar);
                                            break;
                                        case 259:
                                            azsVar.y(diiVar);
                                            break;
                                        case 260:
                                            azsVar.t(diiVar);
                                            break;
                                        case 262:
                                            azsVar.E(dijVar, diiVar, diiVar, yttVar);
                                            break;
                                        case 263:
                                            azsVar.B(diiVar, i);
                                            break;
                                        case 264:
                                            azsVar.E(dijVar, diiVar, diiVar2, yttVar);
                                            break;
                                        case 265:
                                            azsVar.p(diiVar2, diiVar);
                                            break;
                                        case 266:
                                            azsVar.q(diiVar2, diiVar, i);
                                            break;
                                    }
                                } else if (dij.a().t() && diiVar.l() && i2 == 262) {
                                    i = 3;
                                    if (i3 == 3 && diiVar2 != null && !diiVar2.l()) {
                                        switch (i2) {
                                            case 257:
                                                azsVar.x(diiVar);
                                                break;
                                            case 258:
                                                azsVar.z(diiVar);
                                                break;
                                            case 259:
                                                azsVar.y(diiVar);
                                                break;
                                            case 260:
                                                azsVar.t(diiVar);
                                                break;
                                            case 262:
                                                azsVar.E(dijVar, diiVar, diiVar, yttVar);
                                                break;
                                            case 263:
                                                azsVar.B(diiVar, i);
                                                break;
                                            case 264:
                                                azsVar.E(dijVar, diiVar, diiVar2, yttVar);
                                                break;
                                            case 265:
                                                azsVar.p(diiVar2, diiVar);
                                                break;
                                            case 266:
                                                azsVar.q(diiVar2, diiVar, i);
                                                break;
                                        }
                                    }
                                }
                            }
                        } else if (i4 == 512) {
                            switch (i2) {
                                case 513:
                                    azsVar.o();
                                    break;
                                case 514:
                                    azsVar.w();
                                    break;
                                case 515:
                                    azsVar.v();
                                    break;
                            }
                        } else if (i4 == 768 && i2 == 769) {
                            azsVar.u((dim) obj);
                        }
                    }
                    return;
                }
                dij dijVar2 = (dij) ((WeakReference) arrayList.get(size)).get();
                if (dijVar2 == null) {
                    arrayList.remove(size);
                } else {
                    this.b.addAll(dijVar2.c);
                }
            }
        } finally {
            this.b.clear();
        }
    }
}
