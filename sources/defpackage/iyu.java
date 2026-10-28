package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class iyu extends bp {
    @Override // defpackage.bp
    public void dismiss() {
        cf activity = getActivity();
        if (activity == null || !jku.d(activity)) {
            return;
        }
        super.iQ(false, false, false);
    }
}
