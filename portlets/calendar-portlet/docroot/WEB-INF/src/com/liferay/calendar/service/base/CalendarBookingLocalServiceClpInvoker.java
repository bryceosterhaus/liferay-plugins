/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.calendar.service.base;

import com.liferay.calendar.service.CalendarBookingLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Eduardo Lundgren
 * @generated
 */
public class CalendarBookingLocalServiceClpInvoker {
	public CalendarBookingLocalServiceClpInvoker() {
		_methodName0 = "addCalendarBooking";

		_methodParameterTypes0 = new String[] {
				"com.liferay.calendar.model.CalendarBooking"
			};

		_methodName1 = "createCalendarBooking";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteCalendarBooking";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteCalendarBooking";

		_methodParameterTypes3 = new String[] {
				"com.liferay.calendar.model.CalendarBooking"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchCalendarBooking";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "fetchCalendarBookingByUuidAndCompanyId";

		_methodParameterTypes11 = new String[] { "java.lang.String", "long" };

		_methodName12 = "fetchCalendarBookingByUuidAndGroupId";

		_methodParameterTypes12 = new String[] { "java.lang.String", "long" };

		_methodName13 = "getCalendarBooking";

		_methodParameterTypes13 = new String[] { "long" };

		_methodName14 = "getActionableDynamicQuery";

		_methodParameterTypes14 = new String[] {  };

		_methodName16 = "getExportActionableDynamicQuery";

		_methodParameterTypes16 = new String[] {
				"com.liferay.portal.kernel.lar.PortletDataContext"
			};

		_methodName17 = "deletePersistedModel";

		_methodParameterTypes17 = new String[] {
				"com.liferay.portal.model.PersistedModel"
			};

		_methodName18 = "getPersistedModel";

		_methodParameterTypes18 = new String[] { "java.io.Serializable" };

		_methodName19 = "getCalendarBookingByUuidAndCompanyId";

		_methodParameterTypes19 = new String[] { "java.lang.String", "long" };

		_methodName20 = "getCalendarBookingByUuidAndGroupId";

		_methodParameterTypes20 = new String[] { "java.lang.String", "long" };

		_methodName21 = "getCalendarBookings";

		_methodParameterTypes21 = new String[] { "int", "int" };

		_methodName22 = "getCalendarBookingsCount";

		_methodParameterTypes22 = new String[] {  };

		_methodName23 = "updateCalendarBooking";

		_methodParameterTypes23 = new String[] {
				"com.liferay.calendar.model.CalendarBooking"
			};

		_methodName122 = "getBeanIdentifier";

		_methodParameterTypes122 = new String[] {  };

		_methodName123 = "setBeanIdentifier";

		_methodParameterTypes123 = new String[] { "java.lang.String" };

		_methodName128 = "addCalendarBooking";

		_methodParameterTypes128 = new String[] {
				"long", "long", "long[][]", "long", "java.util.Map",
				"java.util.Map", "java.lang.String", "long", "long", "boolean",
				"java.lang.String", "long", "java.lang.String", "long",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName129 = "checkCalendarBookings";

		_methodParameterTypes129 = new String[] {  };

		_methodName130 = "deleteCalendarBooking";

		_methodParameterTypes130 = new String[] {
				"com.liferay.calendar.model.CalendarBooking"
			};

		_methodName131 = "deleteCalendarBooking";

		_methodParameterTypes131 = new String[] { "long" };

		_methodName132 = "deleteCalendarBookingInstance";

		_methodParameterTypes132 = new String[] {
				"com.liferay.calendar.model.CalendarBooking", "int", "boolean"
			};

		_methodName133 = "deleteCalendarBookingInstance";

		_methodParameterTypes133 = new String[] {
				"com.liferay.calendar.model.CalendarBooking", "long", "boolean"
			};

		_methodName134 = "deleteCalendarBookingInstance";

		_methodParameterTypes134 = new String[] { "long", "long", "boolean" };

		_methodName135 = "deleteCalendarBookings";

		_methodParameterTypes135 = new String[] { "long" };

		_methodName136 = "exportCalendarBooking";

		_methodParameterTypes136 = new String[] { "long", "java.lang.String" };

		_methodName137 = "fetchCalendarBooking";

		_methodParameterTypes137 = new String[] { "java.lang.String", "long" };

		_methodName138 = "getCalendarBooking";

		_methodParameterTypes138 = new String[] { "long" };

		_methodName139 = "getCalendarBooking";

		_methodParameterTypes139 = new String[] { "long", "long" };

		_methodName140 = "getCalendarBookings";

		_methodParameterTypes140 = new String[] { "long" };

		_methodName141 = "getCalendarBookings";

		_methodParameterTypes141 = new String[] { "long", "int[][]" };

		_methodName142 = "getCalendarBookings";

		_methodParameterTypes142 = new String[] { "long", "long", "long" };

		_methodName143 = "getCalendarBookings";

		_methodParameterTypes143 = new String[] { "long", "long", "long", "int" };

		_methodName144 = "getCalendarBookingsCount";

		_methodParameterTypes144 = new String[] { "long", "long" };

		_methodName145 = "getChildCalendarBookings";

		_methodParameterTypes145 = new String[] { "long" };

		_methodName146 = "getChildCalendarBookings";

		_methodParameterTypes146 = new String[] { "long", "int" };

		_methodName147 = "getChildCalendarIds";

		_methodParameterTypes147 = new String[] { "long", "long" };

		_methodName148 = "moveCalendarBookingToTrash";

		_methodParameterTypes148 = new String[] {
				"long", "com.liferay.calendar.model.CalendarBooking"
			};

		_methodName149 = "moveCalendarBookingToTrash";

		_methodParameterTypes149 = new String[] { "long", "long" };

		_methodName150 = "restoreCalendarBookingFromTrash";

		_methodParameterTypes150 = new String[] { "long", "long" };

		_methodName151 = "search";

		_methodParameterTypes151 = new String[] {
				"long", "long[][]", "long[][]", "long[][]", "long",
				"java.lang.String", "long", "long", "boolean", "int[][]", "int",
				"int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName152 = "search";

		_methodParameterTypes152 = new String[] {
				"long", "long[][]", "long[][]", "long[][]", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "long", "boolean", "int[][]", "boolean", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName153 = "searchCount";

		_methodParameterTypes153 = new String[] {
				"long", "long[][]", "long[][]", "long[][]", "long",
				"java.lang.String", "long", "long", "int[][]"
			};

		_methodName154 = "searchCount";

		_methodParameterTypes154 = new String[] {
				"long", "long[][]", "long[][]", "long[][]", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "long", "int[][]", "boolean"
			};

		_methodName155 = "updateAsset";

		_methodParameterTypes155 = new String[] {
				"long", "com.liferay.calendar.model.CalendarBooking", "long[][]",
				"java.lang.String[][]", "long[][]"
			};

		_methodName156 = "updateCalendarBooking";

		_methodParameterTypes156 = new String[] {
				"long", "long", "long", "long[][]", "java.util.Map",
				"java.util.Map", "java.lang.String", "long", "long", "boolean",
				"java.lang.String", "long", "java.lang.String", "long",
				"java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName157 = "updateCalendarBooking";

		_methodParameterTypes157 = new String[] {
				"long", "long", "long", "java.util.Map", "java.util.Map",
				"java.lang.String", "long", "long", "boolean",
				"java.lang.String", "long", "java.lang.String", "long",
				"java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName158 = "updateCalendarBookingInstance";

		_methodParameterTypes158 = new String[] {
				"long", "long", "int", "long", "long[][]", "java.util.Map",
				"java.util.Map", "java.lang.String", "long", "long", "boolean",
				"java.lang.String", "boolean", "long", "java.lang.String",
				"long", "java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName159 = "updateCalendarBookingInstance";

		_methodParameterTypes159 = new String[] {
				"long", "long", "int", "long", "java.util.Map", "java.util.Map",
				"java.lang.String", "long", "long", "boolean",
				"java.lang.String", "boolean", "long", "java.lang.String",
				"long", "java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName160 = "updateStatus";

		_methodParameterTypes160 = new String[] {
				"long", "com.liferay.calendar.model.CalendarBooking", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName161 = "updateStatus";

		_methodParameterTypes161 = new String[] {
				"long", "long", "int",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.addCalendarBooking((com.liferay.calendar.model.CalendarBooking)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.createCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.deleteCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.deleteCalendarBooking((com.liferay.calendar.model.CalendarBooking)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<?>)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.fetchCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.fetchCalendarBookingByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.fetchCalendarBookingByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getActionableDynamicQuery();
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getExportActionableDynamicQuery((com.liferay.portal.kernel.lar.PortletDataContext)arguments[0]);
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.deletePersistedModel((com.liferay.portal.model.PersistedModel)arguments[0]);
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookingByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookingByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookings(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookingsCount();
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.updateCalendarBooking((com.liferay.calendar.model.CalendarBooking)arguments[0]);
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			CalendarBookingLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.addCalendarBooking(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (long[])arguments[2],
				((Long)arguments[3]).longValue(),
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[4],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[5],
				(java.lang.String)arguments[6],
				((Long)arguments[7]).longValue(),
				((Long)arguments[8]).longValue(),
				((Boolean)arguments[9]).booleanValue(),
				(java.lang.String)arguments[10],
				((Long)arguments[11]).longValue(),
				(java.lang.String)arguments[12],
				((Long)arguments[13]).longValue(),
				(java.lang.String)arguments[14],
				(com.liferay.portal.service.ServiceContext)arguments[15]);
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			CalendarBookingLocalServiceUtil.checkCalendarBookings();

			return null;
		}

		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.deleteCalendarBooking((com.liferay.calendar.model.CalendarBooking)arguments[0]);
		}

		if (_methodName131.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.deleteCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName132.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
			CalendarBookingLocalServiceUtil.deleteCalendarBookingInstance((com.liferay.calendar.model.CalendarBooking)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Boolean)arguments[2]).booleanValue());

			return null;
		}

		if (_methodName133.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
			CalendarBookingLocalServiceUtil.deleteCalendarBookingInstance((com.liferay.calendar.model.CalendarBooking)arguments[0],
				((Long)arguments[1]).longValue(),
				((Boolean)arguments[2]).booleanValue());

			return null;
		}

		if (_methodName134.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
			CalendarBookingLocalServiceUtil.deleteCalendarBookingInstance(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Boolean)arguments[2]).booleanValue());

			return null;
		}

		if (_methodName135.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes135, parameterTypes)) {
			CalendarBookingLocalServiceUtil.deleteCalendarBookings(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName136.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes136, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.exportCalendarBooking(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName137.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes137, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.fetchCalendarBooking((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName138.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes138, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName139.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes139, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBooking(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName140.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes140, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookings(((Long)arguments[0]).longValue());
		}

		if (_methodName141.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes141, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookings(((Long)arguments[0]).longValue(),
				(int[])arguments[1]);
		}

		if (_methodName142.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes142, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookings(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName143.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes143, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookings(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName144.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes144, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookingsCount(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName145.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes145, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getChildCalendarBookings(((Long)arguments[0]).longValue());
		}

		if (_methodName146.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes146, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getChildCalendarBookings(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName147.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes147, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getChildCalendarIds(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName148.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes148, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.moveCalendarBookingToTrash(((Long)arguments[0]).longValue(),
				(com.liferay.calendar.model.CalendarBooking)arguments[1]);
		}

		if (_methodName149.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes149, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.moveCalendarBookingToTrash(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName150.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes150, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.restoreCalendarBookingFromTrash(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName151.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes151, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.search(((Long)arguments[0]).longValue(),
				(long[])arguments[1], (long[])arguments[2],
				(long[])arguments[3], ((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5],
				((Long)arguments[6]).longValue(),
				((Long)arguments[7]).longValue(),
				((Boolean)arguments[8]).booleanValue(), (int[])arguments[9],
				((Integer)arguments[10]).intValue(),
				((Integer)arguments[11]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.calendar.model.CalendarBooking>)arguments[12]);
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.search(((Long)arguments[0]).longValue(),
				(long[])arguments[1], (long[])arguments[2],
				(long[])arguments[3], ((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7],
				((Long)arguments[8]).longValue(),
				((Long)arguments[9]).longValue(),
				((Boolean)arguments[10]).booleanValue(), (int[])arguments[11],
				((Boolean)arguments[12]).booleanValue(),
				((Integer)arguments[13]).intValue(),
				((Integer)arguments[14]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.calendar.model.CalendarBooking>)arguments[15]);
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.searchCount(((Long)arguments[0]).longValue(),
				(long[])arguments[1], (long[])arguments[2],
				(long[])arguments[3], ((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5],
				((Long)arguments[6]).longValue(),
				((Long)arguments[7]).longValue(), (int[])arguments[8]);
		}

		if (_methodName154.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes154, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.searchCount(((Long)arguments[0]).longValue(),
				(long[])arguments[1], (long[])arguments[2],
				(long[])arguments[3], ((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7],
				((Long)arguments[8]).longValue(),
				((Long)arguments[9]).longValue(), (int[])arguments[10],
				((Boolean)arguments[11]).booleanValue());
		}

		if (_methodName155.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes155, parameterTypes)) {
			CalendarBookingLocalServiceUtil.updateAsset(((Long)arguments[0]).longValue(),
				(com.liferay.calendar.model.CalendarBooking)arguments[1],
				(long[])arguments[2], (java.lang.String[])arguments[3],
				(long[])arguments[4]);

			return null;
		}

		if (_methodName156.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes156, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.updateCalendarBooking(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(), (long[])arguments[3],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[4],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[5],
				(java.lang.String)arguments[6],
				((Long)arguments[7]).longValue(),
				((Long)arguments[8]).longValue(),
				((Boolean)arguments[9]).booleanValue(),
				(java.lang.String)arguments[10],
				((Long)arguments[11]).longValue(),
				(java.lang.String)arguments[12],
				((Long)arguments[13]).longValue(),
				(java.lang.String)arguments[14],
				((Integer)arguments[15]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[16]);
		}

		if (_methodName157.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes157, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.updateCalendarBooking(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[3],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[4],
				(java.lang.String)arguments[5],
				((Long)arguments[6]).longValue(),
				((Long)arguments[7]).longValue(),
				((Boolean)arguments[8]).booleanValue(),
				(java.lang.String)arguments[9],
				((Long)arguments[10]).longValue(),
				(java.lang.String)arguments[11],
				((Long)arguments[12]).longValue(),
				(java.lang.String)arguments[13],
				((Integer)arguments[14]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[15]);
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.updateCalendarBookingInstance(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Long)arguments[3]).longValue(), (long[])arguments[4],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[5],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[6],
				(java.lang.String)arguments[7],
				((Long)arguments[8]).longValue(),
				((Long)arguments[9]).longValue(),
				((Boolean)arguments[10]).booleanValue(),
				(java.lang.String)arguments[11],
				((Boolean)arguments[12]).booleanValue(),
				((Long)arguments[13]).longValue(),
				(java.lang.String)arguments[14],
				((Long)arguments[15]).longValue(),
				(java.lang.String)arguments[16],
				((Integer)arguments[17]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[18]);
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.updateCalendarBookingInstance(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Long)arguments[3]).longValue(),
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[4],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[5],
				(java.lang.String)arguments[6],
				((Long)arguments[7]).longValue(),
				((Long)arguments[8]).longValue(),
				((Boolean)arguments[9]).booleanValue(),
				(java.lang.String)arguments[10],
				((Boolean)arguments[11]).booleanValue(),
				((Long)arguments[12]).longValue(),
				(java.lang.String)arguments[13],
				((Long)arguments[14]).longValue(),
				(java.lang.String)arguments[15],
				((Integer)arguments[16]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[17]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.updateStatus(((Long)arguments[0]).longValue(),
				(com.liferay.calendar.model.CalendarBooking)arguments[1],
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.updateStatus(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName130;
	private String[] _methodParameterTypes130;
	private String _methodName131;
	private String[] _methodParameterTypes131;
	private String _methodName132;
	private String[] _methodParameterTypes132;
	private String _methodName133;
	private String[] _methodParameterTypes133;
	private String _methodName134;
	private String[] _methodParameterTypes134;
	private String _methodName135;
	private String[] _methodParameterTypes135;
	private String _methodName136;
	private String[] _methodParameterTypes136;
	private String _methodName137;
	private String[] _methodParameterTypes137;
	private String _methodName138;
	private String[] _methodParameterTypes138;
	private String _methodName139;
	private String[] _methodParameterTypes139;
	private String _methodName140;
	private String[] _methodParameterTypes140;
	private String _methodName141;
	private String[] _methodParameterTypes141;
	private String _methodName142;
	private String[] _methodParameterTypes142;
	private String _methodName143;
	private String[] _methodParameterTypes143;
	private String _methodName144;
	private String[] _methodParameterTypes144;
	private String _methodName145;
	private String[] _methodParameterTypes145;
	private String _methodName146;
	private String[] _methodParameterTypes146;
	private String _methodName147;
	private String[] _methodParameterTypes147;
	private String _methodName148;
	private String[] _methodParameterTypes148;
	private String _methodName149;
	private String[] _methodParameterTypes149;
	private String _methodName150;
	private String[] _methodParameterTypes150;
	private String _methodName151;
	private String[] _methodParameterTypes151;
	private String _methodName152;
	private String[] _methodParameterTypes152;
	private String _methodName153;
	private String[] _methodParameterTypes153;
	private String _methodName154;
	private String[] _methodParameterTypes154;
	private String _methodName155;
	private String[] _methodParameterTypes155;
	private String _methodName156;
	private String[] _methodParameterTypes156;
	private String _methodName157;
	private String[] _methodParameterTypes157;
	private String _methodName158;
	private String[] _methodParameterTypes158;
	private String _methodName159;
	private String[] _methodParameterTypes159;
	private String _methodName160;
	private String[] _methodParameterTypes160;
	private String _methodName161;
	private String[] _methodParameterTypes161;
}