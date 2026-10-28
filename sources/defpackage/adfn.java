package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adfn implements mfy {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/elements/dialog/ModernElementsDialogController");
    public final Activity b;
    public final zvl c;
    private final zwb d;
    private final mfy e;
    private final Optional f;
    private final vxz g;
    private final syn h;
    private final abfv i;

    public adfn(Context context, abfv abfvVar, zwb zwbVar, syn synVar, vxz vxzVar, mfy mfyVar, Optional optional, zvl zvlVar) {
        this.b = (Activity) context;
        this.i = abfvVar;
        this.d = zwbVar;
        this.h = synVar;
        this.g = vxzVar;
        this.e = mfyVar;
        this.f = optional;
        this.c = zvlVar;
    }

    @Override // defpackage.mfy
    public final void a() {
        Optional optionalE = e();
        if (true == optionalE.isPresent()) {
            ((adfj) optionalE.get()).iN();
        }
        this.e.a();
    }

    @Override // defpackage.mfy
    public final void b(byte[] bArr, mfx mfxVar) {
        Optional optionalE = e();
        addb addbVar = new addb(bArr, 18);
        if (true == optionalE.isPresent()) {
            Object obj = optionalE.get();
            Object obj2 = addbVar.a;
            Dialog dialog = ((adfj) obj).peer().a.f;
            if (dialog != null) {
                ((mel) dialog.findViewById(R.id.elements_dialog_fragment_elements_view)).a((byte[]) obj2, null);
            }
        }
    }

    @Override // defpackage.mfy
    public final void c(asmv asmvVar, mfx mfxVar) {
        d(asmvVar.toByteArray(), mfxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e0, code lost:
    
        if (r1.j.n(r2.d) != false) goto L48;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [aeda, java.lang.Object] */
    @Override // defpackage.mfy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(byte[] r7, defpackage.mfx r8) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adfn.d(byte[], mfx):void");
    }

    final Optional e() {
        Activity activity = this.b;
        if (!(activity instanceof cf)) {
            return Optional.empty();
        }
        cc ccVarG = ((cf) activity).getSupportFragmentManager().g("ElementsDialogFragment");
        return !(ccVarG instanceof adfj) ? Optional.empty() : Optional.of((adfj) ccVarG);
    }
}
