package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wwg extends admr {
    public final TextView a;
    private final aeaa b;

    public wwg(Context context, afip afipVar, aciz acizVar) {
        TextView textView = (TextView) LayoutInflater.from(context).inflate(true != acizVar.C() ? R.layout.live_chat_default_button : R.layout.live_chat_default_button_modern_type, (ViewGroup) null, false);
        this.a = textView;
        this.b = afipVar.d(textView);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.b.a(null, null, null);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        HashMap map = new HashMap(adlyVar.e());
        this.b.a((ajnf) obj, adlyVar.b, map);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ajnf) obj).y.G();
    }

    public wwg(afip afipVar, TextView textView) {
        this.a = textView;
        this.b = afipVar.d(textView);
    }
}
