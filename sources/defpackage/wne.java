package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wne implements wni {
    public static final wne a = new wnd();

    protected abstract Object a(apjh apjhVar);

    @Override // defpackage.wni
    public final void b(Object obj) {
        if (obj instanceof acjy) {
            acjy acjyVar = (acjy) obj;
            acjyVar.c(a(acjyVar.a()));
        }
    }
}
