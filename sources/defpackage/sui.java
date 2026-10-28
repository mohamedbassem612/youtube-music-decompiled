package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sui {
    public final vxe a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final SeekBar f;
    public final aeaa g;
    public final aeaa h;
    public final Dialog i;
    public aqxb j;
    public int k = 0;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;

    public sui(Context context, afip afipVar, vxe vxeVar) {
        context.getClass();
        afipVar.getClass();
        vxeVar.getClass();
        this.a = vxeVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.ypc_pause_membership_dialog, (ViewGroup) null);
        this.b = viewInflate;
        this.c = (TextView) viewInflate.findViewById(R.id.title);
        this.d = (TextView) viewInflate.findViewById(R.id.subtitle);
        this.e = (TextView) viewInflate.findViewById(R.id.description);
        this.l = (TextView) viewInflate.findViewById(R.id.pause_period);
        this.m = (TextView) viewInflate.findViewById(R.id.pause_end);
        this.f = (SeekBar) viewInflate.findViewById(R.id.pause_period_slider);
        TextView textView = (TextView) viewInflate.findViewById(R.id.primary_button);
        this.n = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.cancel);
        this.o = textView2;
        this.g = afipVar.d(textView);
        this.h = afipVar.d(textView2);
        Dialog dialog = new Dialog(context);
        this.i = dialog;
        dialog.setContentView(viewInflate);
    }

    public static Spanned a(Spanned[] spannedArr, int i) {
        if (spannedArr.length > i) {
            return spannedArr[i];
        }
        return null;
    }

    public final void b() {
        aqxb aqxbVar = this.j;
        if (aqxbVar != null) {
            TextView textView = this.l;
            alay alayVar = ((aqxa) aqxbVar.d.get(this.k)).b;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            textView.setText(ackj.k(null, alayVar, null, false));
            TextView textView2 = this.m;
            aqxb aqxbVar2 = this.j;
            alay alayVar2 = ((aqxa) aqxbVar2.d.get(this.k)).c;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            textView2.setText(ackj.k(null, alayVar2, null, false));
            SeekBar seekBar = this.f;
            aqxb aqxbVar3 = this.j;
            aiqd aiqdVar = ((aqxa) aqxbVar3.d.get(this.k)).d;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
            seekBar.setContentDescription(aiqdVar.c);
        }
    }
}
