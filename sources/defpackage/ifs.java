package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ifs extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ ift c;
    final /* synthetic */ boolean d;
    final /* synthetic */ abnl e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifs(ift iftVar, boolean z, abnl abnlVar, boolean z2, awoq awoqVar) {
        super(2, awoqVar);
        this.c = iftVar;
        this.d = z;
        this.e = abnlVar;
        this.f = z2;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new ifs(this.c, this.d, this.e, this.f, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ifs) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [abjl] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r0;
        awox awoxVar = awox.a;
        if (this.b == 0) {
            atqp.j(obj);
            ift iftVar = this.c;
            abjl abjlVar = iftVar.k;
            if (abjlVar != null) {
                ifn ifnVar = iftVar.b;
                boolean z = this.d;
                this.a = abjlVar;
                this.b = 1;
                obj = ifnVar.c(z, null, this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
                r0 = abjlVar;
            }
            return awmy.a;
        }
        Object obj2 = this.a;
        atqp.j(obj);
        r0 = obj2;
        final ift iftVar2 = this.c;
        final List list = (List) obj;
        final int iA = iftVar2.b.a(this.d);
        boolean zHm = r0.hm();
        new Integer(iA);
        new Integer(list.size());
        if (zHm) {
            final abnl abnlVar = this.e;
            final boolean z2 = this.f;
            list.size();
            if (a.x()) {
                iftVar2.e(list, iA, abnlVar, z2);
            } else {
                ((agrc) ift.a.b().k("com/google/android/apps/youtube/music/player/sequence/QueueSequencerUpdater", "setSequence", 290, "QueueSequencerUpdater.kt")).t("Queue was modified outside of the main thread. Sequencer changes must occur on the main thread.");
                iftVar2.h.execute(afwl.i(new Runnable() { // from class: ifp
                    @Override // java.lang.Runnable
                    public final void run() {
                        iftVar2.e(list, iA, abnlVar, z2);
                    }
                }));
            }
        }
        return awmy.a;
    }
}
