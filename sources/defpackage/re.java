package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class re extends rc {
    final /* synthetic */ rg a;
    final /* synthetic */ String b;
    final /* synthetic */ rj c;

    public re(rg rgVar, String str, rj rjVar) {
        this.a = rgVar;
        this.b = str;
        this.c = rjVar;
    }

    @Override // defpackage.rc
    public final void a() {
        throw null;
    }

    @Override // defpackage.rc
    public final void b(Object obj, aad aadVar) throws Exception {
        rg rgVar = this.a;
        Map map = rgVar.b;
        rj rjVar = this.c;
        String str = this.b;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            throw new IllegalStateException(a.bW(obj, rjVar, "Attempting to launch an unregistered ActivityResultLauncher with contract ", " and input ", ". You must ensure the ActivityResultLauncher is registered before calling launch()."));
        }
        int iIntValue = ((Number) obj2).intValue();
        rgVar.c.add(str);
        try {
            rgVar.f(iIntValue, rjVar, obj, aadVar);
        } catch (Exception e) {
            rg rgVar2 = this.a;
            rgVar2.c.remove(this.b);
            throw e;
        }
    }
}
