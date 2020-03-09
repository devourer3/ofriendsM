package com.gibeom.ofriendsmobile.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0082\u0001\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u00062\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\f\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0006\u001aD\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u00032\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"resultLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/gibeom/ofriendsmobile/data/Result;", "T", "T1", "databaseQuery", "Lkotlin/Function0;", "networkCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "saveCallResult", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "resultNetworkData", "resultNetworkLiveData", "(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "app_debug"})
public final class SingleSourceOfTruthStrategyKt {
    
    /**
     * The database serves as the single source of truth.
     * Therefore UI can receive data updates from database only.
     * Function notify UI about:
     * [Result.Status.SUCCESS] - with data from database
     * [Result.Status.ERROR] - if error has occurred from any source
     * [Result.Status.LOADING]
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, T1 extends java.lang.Object>androidx.lifecycle.LiveData<com.gibeom.ofriendsmobile.data.Result<T>> resultLiveData(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends androidx.lifecycle.LiveData<T>> databaseQuery, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.gibeom.ofriendsmobile.data.Result<T1>>, ? extends java.lang.Object> networkCall, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T1, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> saveCallResult) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<com.gibeom.ofriendsmobile.data.Result<T>> resultNetworkLiveData(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.gibeom.ofriendsmobile.data.Result<T>>, ? extends java.lang.Object> networkCall) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>com.gibeom.ofriendsmobile.data.Result<T> resultNetworkData(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<com.gibeom.ofriendsmobile.data.Result<T>> networkCall) {
        return null;
    }
}