package defpackage;

import android.text.TextPaint;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zou extends frp {
    private final nry a;
    private final CommandOuterClass$Command b;
    private final CommandOuterClass$Command c;

    public zou(askq askqVar, nry nryVar) {
        this.a = nryVar;
        CommandOuterClass$Command commandOuterClass$Command = askqVar.e;
        this.b = commandOuterClass$Command == null ? CommandOuterClass$Command.getDefaultInstance() : commandOuterClass$Command;
        CommandOuterClass$Command commandOuterClass$Command2 = askqVar.f;
        this.c = commandOuterClass$Command2 == null ? CommandOuterClass$Command.getDefaultInstance() : commandOuterClass$Command2;
    }

    @Override // defpackage.frp
    public final boolean c(View view) {
        CommandOuterClass$Command commandOuterClass$Command = this.c;
        if (commandOuterClass$Command == null) {
            return false;
        }
        nry nryVar = this.a;
        nrt nrtVarD = nrv.d();
        nrtVarD.d(view);
        nryVar.a(commandOuterClass$Command, nrtVarD.a()).D();
        return true;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        CommandOuterClass$Command commandOuterClass$Command = this.b;
        if (commandOuterClass$Command != null) {
            nry nryVar = this.a;
            nrt nrtVarD = nrv.d();
            nrtVarD.d(view);
            nryVar.a(commandOuterClass$Command, nrtVarD.a()).D();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
