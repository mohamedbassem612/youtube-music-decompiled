package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atwh {
    public Object b = new ArrayList();
    public Object c = new ArrayList();
    public boolean a = false;

    public atwh(byte[] bArr) {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    private final void c() {
        if (this.a) {
            this.b = new ArrayList((Collection) this.b);
            this.c = new ArrayList((Collection) this.c);
            this.a = false;
        }
    }

    public final void a(Collection collection) {
        azs.l(collection);
        c();
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            int i = ss.b;
            azs.l(obj);
            sn snVarB = sn.b();
            azs.l(obj);
            arrayList.add(snVarB.a(obj.getClass()).b(obj));
        }
        c();
        ((ArrayList) this.b).addAll(arrayList);
    }

    public final eol b() {
        this.a = true;
        afx afxVar = new afx(0);
        for (int i = 0; i < ((ArrayList) this.b).size(); i++) {
            afxVar.add(((ss) ((ArrayList) this.b).get(i)).e());
        }
        for (int i2 = 0; i2 < ((ArrayList) this.c).size(); i2++) {
            ss ssVar = (ss) ((ArrayList) this.c).get(i2);
            if (afxVar.contains(ssVar.e())) {
                throw new IllegalArgumentException("Document id " + ssVar.e() + " cannot exist in both taken action and normal document");
            }
        }
        return new eol(this.b, this.c);
    }
}
