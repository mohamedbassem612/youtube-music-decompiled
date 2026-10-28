package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afiq implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ afiq(aeoo aeooVar, aeom aeomVar, int i) {
        this.$cid = i;
        this.b = aeooVar;
        this.a = aeomVar;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                Object obj2 = this.b;
                return i != 2 ? ((agov) this.a).b.a(obj2, obj) : ((agou) this.a).b.a(obj2, obj);
            }
            byte[] bArr = (byte[]) obj;
            aeoo aeooVar = (aeoo) this.b;
            aeooVar.d();
            String str = aeooVar.b.getAndIncrement() + ".tmp";
            String str2 = aeooVar.a;
            File file = new File(str2, str);
            Object obj3 = this.a;
            try {
                File file2 = new File(str2, aeor.a((aeom) obj3));
                agyo.b(file);
                agvp.d(bArr, file, agkz.o(new agyl[]{agyl.APPEND}));
                agyo.b(file2);
                if (!file.exists()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add("mv");
                arrayList.add(file.getAbsolutePath());
                arrayList.add(file2.getAbsolutePath());
                aeoo.c(arrayList);
                return null;
            } catch (IOException e) {
                aeooVar.b(new adge(file, 9));
                aeooVar.d();
                throw new RuntimeException("Unexpected error when writing the value for: ".concat(obj3.toString()), e);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Unexpected error occurred while trying to persist data for: ".concat(obj3.toString()));
            }
        }
        Iterator it = DesugarCollections.unmodifiableMap(((afiu) obj).d).values().iterator();
        while (true) {
            Object obj4 = this.a;
            if (!it.hasNext()) {
                throw new afig("No account is found for ".concat((String) obj4));
            }
            afiw afiwVar = (afiw) it.next();
            afhq afhqVar = afiwVar.d;
            if (afhqVar == null) {
                afhqVar = afhq.a;
            }
            if (afhqVar.f.equals(obj4)) {
                afhq afhqVar2 = afiwVar.d;
                if (afhqVar2 == null) {
                    afhqVar2 = afhq.a;
                }
                if (afhqVar2.c.equals(this.b)) {
                    int iAS = a.aS(afiwVar.e);
                    if (iAS == 0 || iAS != 2) {
                        throw new afig(a.bT((String) obj4, "account of type ", " is not enabled"));
                    }
                    return affd.a(afiwVar.c);
                }
            }
        }
    }

    public /* synthetic */ afiq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
