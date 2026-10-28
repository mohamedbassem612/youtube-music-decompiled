package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class dvr {
    private final WebSettingsBoundaryInterface a;

    public dvr(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.a = webSettingsBoundaryInterface;
    }

    public void a() {
        this.a.setPaymentRequestEnabled(true);
    }
}
