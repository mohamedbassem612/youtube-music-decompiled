package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wdm extends wcz {
    private final web a;
    private final String b;
    private final aijp c;

    public wdm(web webVar, String str, aijp aijpVar) {
        this.a = webVar;
        this.b = str;
        this.c = aijpVar;
    }

    @Override // defpackage.wcz
    public final void b(wdl wdlVar, omr omrVar, agjz agjzVar) throws wcm {
        aijp aijpVar;
        String str = this.b;
        if (TextUtils.isEmpty(str)) {
            aijpVar = wff.a.d;
        } else {
            try {
                Cursor cursorN = omrVar.n(web.l(str, wea.d).p());
                try {
                    aijpVar = (aijp) web.f(cursorN, str, new wdw(1)).orElse(wff.a.d);
                    if (cursorN != null) {
                        cursorN.close();
                    }
                } catch (Throwable th) {
                    if (cursorN != null) {
                        try {
                            cursorN.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw wcm.a(e, -1, 3, 5);
            }
        }
        if (wey.b(aijpVar, this.c)) {
            try {
                String str2 = this.b;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                hashSet2.add(str2);
                while (!hashSet2.isEmpty()) {
                    omr omrVar2 = new omr();
                    omrVar2.i("SELECT DISTINCT child_entity_key FROM entity_associations WHERE parent_entity_key IN ");
                    tzk.Q(omrVar2, hashSet2);
                    hashSet.addAll(hashSet2);
                    hashSet2.clear();
                    Cursor cursorN2 = omrVar.n(omrVar2.p());
                    while (cursorN2.moveToNext()) {
                        try {
                            String string = cursorN2.getString(0);
                            if (string != null) {
                                hashSet2.add(string);
                            }
                        } catch (Throwable th3) {
                            if (cursorN2 != null) {
                                try {
                                    cursorN2.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    }
                    if (cursorN2 != null) {
                        cursorN2.close();
                    }
                    if (hashSet2.isEmpty()) {
                        break;
                    }
                    omr omrVar3 = new omr();
                    omrVar3.i("SELECT DISTINCT child_entity_key FROM entity_associations WHERE child_entity_key IN ");
                    tzk.Q(omrVar3, hashSet2);
                    omrVar3.i(" AND parent_entity_key NOT IN ");
                    tzk.Q(omrVar3, hashSet);
                    Cursor cursorN3 = omrVar.n(omrVar3.p());
                    while (cursorN3.moveToNext()) {
                        try {
                            hashSet2.remove(cursorN3.getString(0));
                        } catch (Throwable th5) {
                            if (cursorN3 != null) {
                                try {
                                    cursorN3.close();
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                            }
                            throw th5;
                        }
                    }
                    if (cursorN3 != null) {
                        cursorN3.close();
                    }
                }
                agkz<String> agkzVarN = agkz.n(hashSet);
                if (agjzVar != null) {
                    web webVar = this.a;
                    for (wff wffVar : (agkzVarN.isEmpty() ? agpn.b : (agkj) web.m(omrVar, webVar.k(agkzVarN, wea.e).p(), new wdx(webVar, 0)).collect(aghu.a(new vmw(4), Function$CC.identity()))).values()) {
                        weh wehVar = wffVar.b;
                        if (wehVar != null) {
                            aaun aaunVar = new aaun();
                            aaunVar.d(wehVar.b());
                            aaunVar.f = wehVar;
                            aaunVar.e(wffVar.c);
                            aaunVar.c(wej.a);
                            agjzVar.h(aaunVar.b());
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                Iterator it = agkzVarN.iterator();
                sb.append("key IN(?");
                arrayList.add((String) it.next());
                while (it.hasNext()) {
                    sb.append(", ?");
                    arrayList.add((String) it.next());
                }
                sb.append(")");
                omrVar.q(nqw.g("entity_table", sb, arrayList));
                if (!agkzVarN.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    ArrayList arrayList2 = new ArrayList();
                    sb2.append("parent_entity_key IN ");
                    sb2.append(" (");
                    boolean z = true;
                    for (String str3 : agkzVarN) {
                        String str4 = "?";
                        if (true != z) {
                            str4 = ",?";
                        }
                        sb2.append(str4);
                        arrayList2.add(str3);
                        z = false;
                    }
                    sb2.append(") ");
                    omrVar.q(nqw.g("entity_associations", sb2, arrayList2));
                }
                tzk.P(omrVar, this.b);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw wcm.a(e2, -1, 4, 5);
            }
        }
    }
}
