//
// HYBGeoPoint.m
// [y] hybris Platform
//
// Copyright (c) 2000-2015 hybris AG
// All rights reserved.
//
// This software is the confidential and proprietary information of hybris
// ("Confidential Information"). You shall not disclose such Confidential
// Information and shall use it only in accordance with the terms of the
// license agreement you entered into with hybris.
//
// Warning:This file was auto-generated by OCC2Ojbc.
//

#import "HYBGeoPoint.h"
#import "NSValueTransformer+MTLPredefinedTransformerAdditions.h"



@implementation HYBGeoPoint

+ (instancetype)geoPointWithParams:(NSDictionary*)params {

NSError *error = nil;
HYBGeoPoint *object = [MTLJSONAdapter modelOfClass:[HYBGeoPoint class] fromJSONDictionary:params error:&error];

if (error) {
    NSLog(@"Couldn't convert JSON to model HYBGeoPoint");
    return nil;
}

return object;
}

+ (NSDictionary *)JSONKeyPathsByPropertyKey {
   return @{
@"latitude" : @"latitude",
@"longitude" : @"longitude"
};
}






@end