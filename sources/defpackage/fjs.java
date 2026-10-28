package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fjs {
    public static final /* synthetic */ int a = 0;
    private static final HashSet b;

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add("_changeset");
        hashSet.add("_firstlayout");
    }

    public fjs() {
        new HashSet();
        new HashSet();
    }

    public static boolean b(fjs fjsVar) {
        return fjsVar != null && fjsVar.a();
    }

    protected abstract boolean a();
}
