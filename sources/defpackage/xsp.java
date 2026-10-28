package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xsp implements adma {
    private final View a;
    private final xsv b;

    public xsp(Context context, xsv xsvVar) {
        View viewInflate = View.inflate(context, R.layout.mdx_device_picker_header, null);
        this.a = viewInflate;
        this.b = xsvVar;
        xsvVar.a(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        View view = this.a;
        xso xsoVar = (xso) obj;
        TextView textView = (TextView) view.findViewById(R.id.sheet_title);
        if (xsoVar.a) {
            if (xsoVar.b) {
                textView.setText(R.string.playing_title);
            } else {
                textView.setText(R.string.playing_on_title);
            }
        } else if (xsoVar.c == 1) {
            textView.setText(R.string.connecting_title);
        } else {
            textView.setText(R.string.play_on_title);
        }
        xsv xsvVar = this.b;
        xsvVar.a(view);
        xsvVar.c();
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
