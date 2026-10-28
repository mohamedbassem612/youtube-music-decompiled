package defpackage;

import android.text.TextPaint;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class vxj extends tuc {
    private static vxi f;
    private static vxi g;
    private final vxe a;
    public final ajwo c;
    private final Map d;
    private final boolean e;

    public vxj(vxe vxeVar, Map map, ajwo ajwoVar, boolean z) {
        this.a = vxeVar;
        this.d = map;
        this.c = ajwoVar;
        this.e = z;
    }

    public static synchronized vxi a(boolean z) {
        vxi vxiVar;
        try {
            if (z) {
                vxiVar = f;
                if (vxiVar == null) {
                    vxiVar = new vxi(true);
                    f = vxiVar;
                }
            } else {
                vxiVar = g;
                if (vxiVar == null) {
                    vxiVar = new vxi(false);
                    g = vxiVar;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return vxiVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.a.c(this.c, this.d);
    }

    @Override // defpackage.tuc, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.e);
    }
}
