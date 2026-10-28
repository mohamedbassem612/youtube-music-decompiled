package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nyd implements nxl {
    private final nuc a;

    public nyd(nuc nucVar) {
        this.a = nucVar;
    }

    @Override // defpackage.nxl
    public final Typeface a(Context context, String str) {
        return b(context, str, 0, false);
    }

    @Override // defpackage.nxl
    public final Typeface b(Context context, String str, int i, boolean z) {
        if (str.startsWith("fonts/")) {
            try {
                return Typeface.createFromAsset(context.getAssets(), str);
            } catch (RuntimeException e) {
                aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                aslh aslhVar = aslh.LOG_TYPE_INVALID_FIELD;
                aihfVarCreateBuilder.copyOnWrite();
                asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                asncVar.d = aslhVar.I;
                asncVar.b |= 2;
                aihf aihfVarCreateBuilder2 = asmy.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                asmy asmyVar = (asmy) aihfVarCreateBuilder2.instance;
                str.getClass();
                asmyVar.b |= 1;
                asmyVar.c = str;
                aihfVarCreateBuilder.copyOnWrite();
                asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
                asmy asmyVar2 = (asmy) aihfVarCreateBuilder2.build();
                asmyVar2.getClass();
                asncVar2.n = asmyVar2;
                asncVar2.b |= SemanticState.ReadOnly;
                this.a.e((asnc) aihfVarCreateBuilder.build(), e, "Failed to load font.", new Object[0]);
            }
        } else if (str.startsWith("Google Sans Flex")) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/GoogleSansFlex-VariableFont_GRAD,ROND,opsz,slnt,wdth,wght.ttf");
            } catch (RuntimeException e2) {
                aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
                aslh aslhVar2 = aslh.LOG_TYPE_INVALID_FIELD;
                aihfVarCreateBuilder3.copyOnWrite();
                asnc asncVar3 = (asnc) aihfVarCreateBuilder3.instance;
                asncVar3.d = aslhVar2.I;
                asncVar3.b |= 2;
                aihf aihfVarCreateBuilder4 = asmy.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                asmy asmyVar3 = (asmy) aihfVarCreateBuilder4.instance;
                str.getClass();
                asmyVar3.b |= 1;
                asmyVar3.c = str;
                aihfVarCreateBuilder3.copyOnWrite();
                asnc asncVar4 = (asnc) aihfVarCreateBuilder3.instance;
                asmy asmyVar4 = (asmy) aihfVarCreateBuilder4.build();
                asmyVar4.getClass();
                asncVar4.n = asmyVar4;
                asncVar4.b |= SemanticState.ReadOnly;
                this.a.e((asnc) aihfVarCreateBuilder3.build(), e2, "Failed to load Google Sans Flexfont.", new Object[0]);
            }
        }
        return null;
    }

    @Override // defpackage.nxl
    public final /* synthetic */ Typeface c(Context context, String str, int i, boolean z, String str2) {
        return b(context, str, i, z);
    }

    @Override // defpackage.nxl
    public final int d(String str) {
        return str.startsWith("Google Sans Flex") ? 2 : 1;
    }
}
