package defpackage;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kz {
    public TextClassifier a;
    private final TextView b;

    public kz(TextView textView) {
        this.b = textView;
    }

    public final TextClassifier a() {
        TextClassifier textClassifier = this.a;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManagerM810m = gp$$ExternalSyntheticApiModelOutline2.m810m(this.b.getContext().getSystemService(gp$$ExternalSyntheticApiModelOutline2.m812m()));
        return textClassificationManagerM810m != null ? textClassificationManagerM810m.getTextClassifier() : TextClassifier.NO_OP;
    }
}
