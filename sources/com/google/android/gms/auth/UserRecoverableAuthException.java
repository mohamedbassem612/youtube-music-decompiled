package com.google.android.gms.auth;

import android.content.Intent;
import defpackage.jxr;
import defpackage.kro;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class UserRecoverableAuthException extends jxr {
    public final Intent b;
    public final int c;

    public UserRecoverableAuthException(String str, Intent intent, int i) {
        super(str);
        this.b = intent;
        this.c = i;
    }

    public static UserRecoverableAuthException a(String str, Intent intent) {
        kro.l(intent);
        return new UserRecoverableAuthException(str, intent, 2);
    }
}
