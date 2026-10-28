package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ygy implements yfb {
    public final syp a;

    public ygy(syr syrVar) {
        this.a = syrVar.b(20);
    }

    @Override // defpackage.yfb
    public final boolean b(String str, String str2) {
        syp sypVar = this.a;
        int iCn = zik.cn(str2);
        Set set = (Set) sypVar.a(str);
        if (set == null || set.isEmpty()) {
            return true;
        }
        return set.contains(Integer.valueOf(iCn));
    }
}
