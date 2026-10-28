package defpackage;

import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class agw implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ agw(int i) {
        this.$cid = i;
        this.a = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
    }

    /* JADX WARN: Type inference failed for: r11v36, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v33, types: [abun, abvz] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        switch (this.$cid) {
            case 0:
                return obj != this.a ? String.valueOf(obj) : "(this)";
            case 1:
                return obj != this.a ? String.valueOf(obj) : "(this)";
            case 2:
                Throwable th = (Throwable) obj;
                Object obj2 = this.a;
                if (th != null) {
                    ((bfp) obj2).g.i(new bgb(th));
                }
                bfp bfpVar = (bfp) obj2;
                if (bfpVar.d.b()) {
                    bfy bfyVarJ = bfpVar.j();
                    bfyVarJ.b.set(true);
                    bfyVarJ.a.invoke();
                }
                return awmy.a;
            case 3:
                dpb dpbVar = (dpb) obj;
                dpbVar.getClass();
                this.a.invoke(new dlw(dpbVar));
                return awmy.a;
            case 4:
                dpb dpbVar2 = (dpb) obj;
                dpbVar2.getClass();
                dmw dmwVar = (dmw) this.a;
                int i = dmwVar.h;
                if (i > 0) {
                    int i2 = 1;
                    while (true) {
                        int i3 = dmwVar.g[i2];
                        if (i3 == 1) {
                            dpbVar2.h(i2);
                        } else if (i3 == 2) {
                            dpbVar2.g(i2, dmwVar.c[i2]);
                        } else if (i3 == 3) {
                            dpbVar2.f(i2, dmwVar.d[i2]);
                        } else if (i3 == 4) {
                            String str = dmwVar.e[i2];
                            if (str == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            dpbVar2.i(i2, str);
                        } else if (i3 == 5) {
                            byte[] bArr = dmwVar.f[i2];
                            if (bArr == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            dpbVar2.e(i2, bArr);
                        }
                        if (i2 != i) {
                            i2++;
                        }
                    }
                }
                return awmy.a;
            case 5:
                ((String) obj).getClass();
                if (((dpa) ((aack) this.a).c).b) {
                    return awmy.a;
                }
                throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            case 6:
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                dpb dpbVarA = dptVar.a((String) this.a);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (dpbVarA.l()) {
                        arrayList.add(dpbVarA.d(0));
                    }
                    dpbVarA.close();
                    return arrayList;
                } catch (Throwable th2) {
                    dpbVarA.close();
                    throw th2;
                }
            case 7:
                dpt dptVar2 = (dpt) obj;
                dptVar2.getClass();
                dpb dpbVarA2 = dptVar2.a((String) this.a);
                try {
                    dpbVarA2.l();
                    return awmy.a;
                } finally {
                    dpbVarA2.close();
                }
            case 8:
                dpt dptVar3 = (dpt) obj;
                dptVar3.getClass();
                dpb dpbVarA3 = dptVar3.a((String) this.a);
                try {
                    return Boolean.valueOf(dpbVarA3.l() && ((int) dpbVarA3.b(0)) != 0);
                } finally {
                    dpbVarA3.close();
                }
            case 9:
                dpt dptVar4 = (dpt) obj;
                dptVar4.getClass();
                dpb dpbVarA4 = dptVar4.a((String) this.a);
                try {
                    dpbVarA4.l();
                    return Integer.valueOf(ape.n(dptVar4));
                } finally {
                    dpbVarA4.close();
                }
            case 10:
                return eol.d((String) this.a, (dpt) obj);
            case 11:
                return eol.d((String) this.a, (dpt) obj);
            case 12:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                workDatabase.getClass();
                vx vxVar = ees.b;
                eed eedVarY = workDatabase.y();
                ArrayList arrayList2 = new ArrayList();
                StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
                ?? r11 = ((dov) this.a).a;
                if (!r11.isEmpty()) {
                    sb.append(" WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
                    int size = r11.size();
                    if (size > 0) {
                        ArrayList arrayList3 = new ArrayList(size);
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList3.add("?");
                        }
                        sb.append(atqq.aD(arrayList3, ",", null, null, null, 62));
                    }
                    sb.append("))");
                    arrayList2.addAll(r11);
                }
                sb.append(';');
                Object objA = vxVar.a(eedVarY.a(new dpc(sb.toString(), arrayList2.toArray(new Object[0]))));
                objA.getClass();
                return objA;
            case 13:
                afwl.i(new fuc(this.a, (aazq) obj, 13)).run();
                return awmy.a;
            case 14:
                abvk abvkVar = ((ify) this.a).b;
                if (abvkVar.ad()) {
                    abvkVar.p();
                }
                return awmy.a;
            case 15:
                ((igb) this.a).a = ((aazq) obj).b.n();
                return awmy.a;
            case 16:
                ((igb) this.a).a = ((aayx) obj).b.a();
                return awmy.a;
            case 17:
                ((bbn) obj).getClass();
                return Integer.valueOf(((jhl) this.a).f.J());
            case 18:
                ((ViewGroup) this.a).setVisibility(true != ((Boolean) obj).booleanValue() ? 8 : 0);
                return awmy.a;
            case 19:
                Integer num = (Integer) obj;
                num.getClass();
                ((ViewGroup) this.a).setPadding(0, 0, 0, num.intValue());
                return awmy.a;
            default:
                Integer num2 = (Integer) obj;
                num2.getClass();
                ((ViewGroup) this.a).setBackgroundColor(num2.intValue());
                return awmy.a;
        }
    }

    public /* synthetic */ agw(int i, byte[] bArr) {
        this.$cid = i;
        this.a = "DELETE FROM WorkProgress";
    }

    public /* synthetic */ agw(int i, char[] cArr) {
        this.$cid = i;
        this.a = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
    }

    public /* synthetic */ agw(int i, int[] iArr) {
        this.$cid = i;
        this.a = "SELECT * FROM workspec WHERE state=1";
    }

    public /* synthetic */ agw(int i, short[] sArr) {
        this.$cid = i;
        this.a = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }

    public /* synthetic */ agw(int i, boolean[] zArr) {
        this.$cid = i;
        this.a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
    }

    public /* synthetic */ agw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
