package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaue {
    public final Activity a;
    public final vxe b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final AlertDialog h;
    public final TextView i;
    public final aeaa j;
    public final aeaa k;
    public final acwn l;
    public ajnf m;
    public ajnf n;
    public xgn o;
    public final NonScrollableListView p;
    public final aauc q;
    public DialogInterface.OnDismissListener r;
    public final aaqg s;
    private final adhv t;

    public aaue(Activity activity, vxe vxeVar, aaqg aaqgVar, adhv adhvVar, afip afipVar, final abfv abfvVar) {
        aatz aatzVar;
        this.a = activity;
        this.b = vxeVar;
        this.s = aaqgVar;
        this.t = adhvVar;
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.upsell_dialog_with_header_images, (ViewGroup) null);
        NonScrollableListView nonScrollableListView = (NonScrollableListView) viewInflate.findViewById(R.id.offline_stream_selection_list);
        this.p = nonScrollableListView;
        aauc aaucVar = new aauc(activity, nonScrollableListView);
        this.q = aaucVar;
        nonScrollableListView.c = aaucVar;
        ListAdapter listAdapter = nonScrollableListView.b;
        if (listAdapter != null && (aatzVar = nonScrollableListView.d) != null) {
            listAdapter.unregisterDataSetObserver(aatzVar);
        }
        nonScrollableListView.b = aaucVar;
        nonScrollableListView.a();
        if (nonScrollableListView.d == null) {
            nonScrollableListView.d = new aatz(nonScrollableListView);
        }
        aaucVar.registerDataSetObserver(nonScrollableListView.d);
        this.c = (ImageView) viewInflate.findViewById(R.id.background_image);
        this.d = (ImageView) viewInflate.findViewById(R.id.logo);
        this.e = (TextView) viewInflate.findViewById(R.id.dialog_title);
        this.f = (TextView) viewInflate.findViewById(R.id.dialog_subtitle);
        this.g = (TextView) viewInflate.findViewById(R.id.dialog_message);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dismiss_button);
        this.i = textView;
        aeaa aeaaVarD = afipVar.d(textView);
        this.k = aeaaVarD;
        aeaa aeaaVarD2 = afipVar.d((TextView) viewInflate.findViewById(R.id.action_button));
        this.j = aeaaVarD2;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(viewInflate).create();
        this.h = alertDialogCreate;
        alertDialogCreate.getClass();
        this.l = new acwg(alertDialogCreate, 1);
        alertDialogCreate.setOnCancelListener(new gxt(this, 14));
        alertDialogCreate.setOnShowListener(new sut(this, abfvVar, 2));
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: aaud
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                abfv abfvVar2 = abfvVar;
                aaue aaueVar = this.a;
                abfvVar2.o(aaueVar.l, "");
                DialogInterface.OnDismissListener onDismissListener = aaueVar.r;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
            }
        });
        sug sugVar = new sug(this, 8);
        aeaaVarD.c = sugVar;
        aeaaVarD2.c = sugVar;
    }

    public final void a(ImageView imageView, aqmh aqmhVar) {
        if (aqmhVar == null) {
            imageView.setVisibility(8);
        } else {
            this.t.j(imageView, aqmhVar, adhr.b);
            imageView.setVisibility(0);
        }
    }
}
